package com.exemplo.repositorio;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.exemplo.entidade.Regra;

public class RepositorioRegra {

	EntityManagerFactory emf;
	EntityManager em;
	
	public RepositorioRegra(){
		emf = Persistence.createEntityManagerFactory("mohr");
		em = emf.createEntityManager();
	}
	
	public Regra obterPorId(int id){
		em.getTransaction().begin();
		Regra regra = em.find(Regra.class, id);
		em.getTransaction().commit();
		emf.close();
		return regra;
	}
	
	public void salvar(Regra regra){
		em.getTransaction().begin();
		em.merge(regra);
		em.getTransaction().commit();
		emf.close();
	}

	public void remover(Regra regra) {
		em.getTransaction().begin();
		em.remove(regra);
		em.getTransaction().commit();
		emf.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Regra> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select regra from Regra regra ORDER BY prioridade ASC");
		List<Regra> regra = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return regra;
	}
	
	@SuppressWarnings("unchecked")
	public List<Regra> listarPrioridade(){
		em.getTransaction().begin();
		Query consulta2 = em.createQuery("select prioridade from Regra regra ORDER BY prioridade ASC");
		List<Regra> regra2 = consulta2.getResultList();
		em.getTransaction().commit();
		emf.close();
		return regra2;
	}

	
	
}

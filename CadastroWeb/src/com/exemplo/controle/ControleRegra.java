package com.exemplo.controle;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.math.BigDecimal;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import com.exemplo.entidade.Regra;
import com.exemplo.repositorio.RepositorioRegra;


@ManagedBean
@SessionScoped

public class ControleRegra {


	Regra regra;
	
	List<Regra> prioridades;
	List<Regra> regras;
	RepositorioRegra repositorioRegra;

	
	
	public ControleRegra(){
		repositorioRegra = new RepositorioRegra();
		regra = new Regra();
	}
	
	
	public String salvar2() throws NoSuchMethodException, ScriptException, FileNotFoundException{
		List<Regra> regras = getPrioridades();
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("D:/Users/Luis/Documents/1 Faculdade Evolução/7° Semestre/Segurança e Auditoria Web/AP2/ProjetoCadastro/CadastroWeb/WebContent/resources/js/script.js"));

		Invocable invocable = (Invocable) engine;

		Object result = invocable.invokeFunction("valor1");
		Object result2 = invocable.invokeFunction("valor2");
		int n = new BigDecimal(result.toString()).intValue();
		int v = new BigDecimal(result2.toString()).intValue();
		
		int idxv = 0;
        int idxn = 0;
      
     for(Regra r : regras){
         if(r.getPrioridade() == v){
            idxv = regras.indexOf(r);
         }
     }

     for(Regra r : regras){
         if(r.getPrioridade() == n){
            idxn = regras.indexOf(r);
         }
     }
     
     Regra r1 = regras.get(idxv);
     r1.setPrioridade(n);
     Regra r2 = regras.get(idxn);
     r2.setPrioridade(v);
     
    //System.out.println(idxv);
   // System.out.println(idxn);
     
    for(Regra r : regras){
         //System.out.println(r.getPrioridade());
     }
		
		repositorioRegra.salvar(regra);
		return "tabelaRegra";
	}
	
	
	public String salvar(){
		repositorioRegra.salvar(regra);
		return "tabelaRegra";
	}
	
	
	
	public String chama(){
		return "tabelaRegra";
	}
	
	
	
	public String chamaFoto(){
		return "imagem";
	}
	
	public String novo(){
		regra = new Regra();
		return "formularioRegra";
	}
	
	
	public String editar(){
		return "formularioRegra2";
	}
	
	public String remover(){
		repositorioRegra.remover(regra);
		return null;
	}
	
	public String limparCampos() {  
		regra = new Regra();
		return "formularioRegra";
    }
		
	public List<Regra> getRegras() {
		regras = repositorioRegra.listarTodos();
		return regras; 
	}

	public void setRegras(List<Regra> regras) {
		this.regras = regras;
	}

	public Regra getRegra() {
		return regra;
	}

	public void setRegra(Regra regra) {
		this.regra = regra;
	}


	public List<Regra> getPrioridades() {
		prioridades = repositorioRegra.listarPrioridade();
		return prioridades;
	}


	public void setPrioridades(List<Regra> prioridades) {
		this.prioridades = prioridades;
	}
	
	

}
	


package com.exemplo.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

@ManagedBean
@SessionScoped

public class ControleCliente {

	Cliente cliente;
	
	
	List<Cliente> clientes;
	RepositorioCliente repositorioCliente;
	
	
	public ControleCliente(){
		repositorioCliente = new RepositorioCliente();
		cliente = new Cliente();
	}
	
	public String salvar(){
		
		repositorioCliente.salvar(cliente);
		return "tabelaProtocolo";
	}
	
	public String chama(){
		return "tabelaProtocolo";
	}
	
	public String chamaIndex(){
		return "index";
	}
	
	public String chamaFoto(){
		return "imagem";
	}
	
	public String chamaRegra(){
		return "tabelaRegra";
	}
	
	public String novo(){
		cliente = new Cliente();
		return "formularioCliente";
	}
	
	
	public String editar(){
		return "formularioCliente";
	}
	
	public String remover(){
		repositorioCliente.remover(cliente);
		return null;
	}
	
	public String limparCampos() {  
		cliente = new Cliente();
		return "formularioCliente";
    }
		

	public List<Cliente> getClientes() {
		clientes = repositorioCliente.listarTodos();
		return clientes; 
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
	


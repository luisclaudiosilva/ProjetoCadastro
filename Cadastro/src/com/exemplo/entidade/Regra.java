package com.exemplo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regra")
public class Regra {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int prioridade;
	@Column
	private String nome;
	@Column
	private String origem;
	@Column
	private String destino;
	@Column
	private String direcao;
	@Column
	private String protocolo;
	@Column
	private String portaInicial;
	@Column
	private String portaFinal;
	@Column
	private String acao;
	@Column
	private String conteudo;
	
	
	
	public int getId() {
		return id;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	public String getPortaInicial() {
		return portaInicial;
	}
	public void setPortaInicial(String portaInicial) {
		this.portaInicial = portaInicial;
	}
	public String getPortaFinal() {
		return portaFinal;
	}
	public void setPortaFinal(String portaFinal) {
		this.portaFinal = portaFinal;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		
	    String espacos50 = "                                                  "; // ponha 32 espaços aqui, oras!  
	    String c = conteudo;  
	    c += espacos50;  
	    c = c.substring (0, 50);
	    
		this.conteudo = c;
	}
	
	
	
	
}

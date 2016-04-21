package com.exemplo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String origem;
	@Column
	private String destino;
	@Column
	private String protocolo;
	@Column
	private String porta;
	@Column
	private String dados;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
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
	
	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		
		String d = dados;
	       
        String espacos50 = "                                              "; // 50 espaços aqui! 
        String quebra = "\r\n";  
       
        String d1 = espacos50 + quebra; 
        d += d1;
       
        d = d.substring (0, 50);
       
        this.dados = d;
	}

}

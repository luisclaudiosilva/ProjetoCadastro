package com.exemplo.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;


//import com.exemplo.entidade.Regra;


import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class AppRegras {

	   public static void main(String[] args) {
	        
	        ArrayList<Regra> regras = new ArrayList<Regra>();
	       
	        regras.add(1, null);
	        regras.add(2, null);
	        regras.add(3, null);
	        regras.add(4, null);
	        
	        System.out.println(regras.listIterator());
	        int n = 4;
	        int v = 2;
	        
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
	       //System.out.println(idxn);
	        
	       for(Regra r : regras){
	            //System.out.println(r.getPrioridade());
	        }
	    
	}
	}
	class Regra{
	 
	    private int prioridade;    
	    
	    Regra(int x){
	        prioridade = x;
	    }
	 
	    public int getPrioridade() {
	        return prioridade;
	    }
	 
	    public void setPrioridade(int prioridade) {
	        this.prioridade = prioridade;
	    }

	


	}



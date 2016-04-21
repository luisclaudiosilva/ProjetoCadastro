package com.exemplo.controle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;


import com.exemplo.entidade.Regra;


import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class AppRegras {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException{
		
		/*
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("WebContent/resources/js/script2.js"));

		Invocable invocable = (Invocable) engine;

		Object result = invocable.invokeFunction("valor1");
		Object result2 = invocable.invokeFunction("valor2");
		int n = new BigDecimal(result.toString()).intValue();
		int v = new BigDecimal(result2.toString()).intValue();
		//int soma = n + v;
		//System.out.println(soma);
		//System.out.println(result.getClass());
		
	        
	        ArrayList<Regra> regras = new ArrayList<Regra>();
	       
	        regras.add(new Regra(1));
	        regras.add(new Regra(2));
	        regras.add(new Regra(3));
	        regras.add(new Regra(4));
	        
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
	        
	       System.out.println(idxv);
	       System.out.println(idxn);
	        
	       for(Regra r : regras){
	            System.out.println(r.getPrioridade());
	        }
	        
	         
		
	        
	        /*
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
	        
	       System.out.println(idxv);
	       System.out.println(idxn);
	        
	       for(Regra r : regras){
	            System.out.println(r.getPrioridade());
	        }
	    */
	}

	


	}



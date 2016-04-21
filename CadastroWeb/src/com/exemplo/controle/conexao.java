package com.exemplo.controle;

import java.io.File;
import java.io.PrintWriter;
import java.sql.*;

public class conexao {
	public void conex()
    {
        Connection conn = null;
        java.sql.Statement st;
        
       Connection conn2 = null;
       java.sql.Statement st2; 
        try
        {
            String userName = "Luis";
            String password = "6871";
            String url = "jdbc:mysql://localhost";
            Class.forName ("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection (url, userName, password);
            conn2 = DriverManager.getConnection (url, userName, password);
            System.out.println ("Conexão com o BD estabelecida!");
            
            st = conn.createStatement();  
            st2 = conn2.createStatement(); 
            ResultSet rs = st.executeQuery("SELECT * FROM loja.cliente"); 
            ResultSet rs2 = st2.executeQuery("SELECT MAX(ID) as id FROM loja.cliente"); 
 
          //id, origem, destino, protocolo, porta, dados
            
            //int lastId = rs2.getInt("id"); 

            File file = new File("D:\\pacote.txt");  
            PrintWriter pw = new PrintWriter(file); 
            //PrintWriter pw2 = new PrintWriter(file); 
            String eof = "EOF";
           
            rs2.next();
            String id = rs2.getString("id");
            
            pw.println(id);
            
            
            while(rs.next()){ 
            pw.printf("%s,%s,%s,%s,%s,%s", rs.getString("id"), rs.getString("origem"), rs.getString("destino"), rs.getString("protocolo"), 
            		rs.getString("porta"), rs.getString("dados"));  
			pw.println();
			} 
           
            pw.printf("%s", eof);
            rs2.close(); 
            
			pw.flush();  
			pw.close();  
            
        }
        catch (Exception e)
        {
            System.err.println ("Não foi possível estabelecer conexão com o BD");
        }
        finally
        {
            if (conn != null || conn2 != null)
            {
                try
                {
                    conn.close ();
                    conn2.close();
                  
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
	
}

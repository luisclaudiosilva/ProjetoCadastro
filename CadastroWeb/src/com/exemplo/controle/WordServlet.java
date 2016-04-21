package com.exemplo.controle;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
  
@WebServlet("/WordServlet") 
public class WordServlet extends HttpServlet { 
	
	ChamaConexao chamaCon = new ChamaConexao();
	
	
	
    private static final long serialVersionUID = 1L; 
         
    public WordServlet() { 
        super(); 
      
    } 
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        doPost(request, response); 
        
    } 
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 
    	
		ChamaConexao.main(null);
    	
        File arquivo = new File("D:\\pacote.txt");
        
       
      //tipo de arquivo
      response.setContentType("text/plain");

      //nome do arquivo a ser exibido na caixa de download do browser
      response.setHeader("Content-Disposition", "attachment; filename=" + arquivo.getName()+ ";");

      //manda os bytes do arquivo pelo response
      URL url = arquivo.toURI().toURL();
      BufferedInputStream leitor = new BufferedInputStream(url.openStream(),4 * 1024);
      OutputStream escritor = response.getOutputStream();
      byte[] buffer = new byte[4 * 1024];
      int size = 0;
      while ((size = leitor.read(buffer, 0, buffer.length)) != -1) {
      escritor.write(buffer, 0, size);
     
      }
      
      escritor.close();
      leitor.close();
    } 
  
}

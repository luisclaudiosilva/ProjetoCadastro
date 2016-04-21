package com.exemplo.teste;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.exemplo.entidade.Cliente;
import com.exemplo.entidade.Regra;
import com.exemplo.repositorio.RepositorioCliente;
import com.exemplo.repositorio.RepositorioRegra;


public class testeRegra {

	public static void main(String[] args) {
		
RepositorioRegra repositorioRegra = new RepositorioRegra();
RepositorioCliente repositorioCliente = new RepositorioCliente();
		
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
    ResultSet rs = st.executeQuery("SELECT MAX(ID) as id FROM loja.cliente"); 
    //ResultSet rs2 = st2.executeQuery("SELECT MAX(ID) FROM loja.cliente"); 
    
    //String sql = "SELECT MAX(ID) FROM loja.cliente";
   // PreparedStatement stmt = (PreparedStatement) conn2.prepareStatement(sql);
   // ResultSet rs2 = stmt.executeQuery(); 
    //String sqlMaxId = rs2; 
    //String maxId = rs2.getString("id");
  //id, origem, destino, protocolo, porta, dados
    //JOptionPane.showMessageDialog(null,rs2);
    //int lastId = rs2.getInt("id"); 
    
    
   // File file = new File("D:\\arquivo.txt");  
    //PrintWriter pw = new PrintWriter(file); 
    //String eof = "EOF";
   
   //pw.println(rs2);
    //rs2.next();
    //String lastId = rs2.getString("id"); 
    //pw.println(lastId);
    rs.next();
    String id = rs.getString("id");
    JOptionPane.showMessageDialog(null,id);
    //rs.close();
    //stmt.close(); 
    
  /*  while(rs.next()){ 
    pw.printf("%s,%s,%s,%s,%s,%s", rs.getString("id"), rs.getString("origem"), rs.getString("destino"), rs.getString("protocolo"), 
    		rs.getString("porta"), rs.getString("dados"));  
	pw.println();
	} 
    //pw.println(maxId);
    pw.printf("%s", eof);*/
	//pw.flush();  
	//pw.close();  
    
}
catch (Exception e)
{
    System.err.println ("Não foi possível estabelecer conexão com o BD");
}
finally
{
    if (conn != null)
    {
        try
        {
            conn.close ();
          
        }
        catch (Exception e) { /* ignore close errors */ }
    }
}




/*try   
{  
	String userName = "Luis";
    String password = "6871";
	String url = "jdbc:mysql://localhost";
	
    // Este é um dos meios para registrar um driver   
    Class.forName("com.mysql.jdbc.Driver");  
   
    // Registrado o driver, vamos estabelecer uma conexão  
    conn = DriverManager.getConnection(url, userName, password);  
    conn2 = DriverManager.getConnection(url, userName, password); 
    System.out.println ("Conexão com o BD estabelecida!");

    // Após estabelecermos a conexão com o banco de dados  
    // Utilizamos o método createStatement de con para criar o Statement  
    st = conn.createStatement();     
    st2 = conn2.createStatement();

    // Definido o Statement, executamos a query no banco de dados  
    ResultSet rs2 = st2.executeQuery("SELECT * FROM loja.cliente"); 
    ResultSet rs = st.executeQuery("SELECT * FROM loja.regra ORDER BY prioridade ASC"); 
  
    rs.next();
    int pri = rs.getInt("prioridade");
    //if(pri >= 1){
    JOptionPane.showMessageDialog(null,pri);
    //}
    //System.out.println(pri);
    
    List<Regra> regras = repositorioRegra.listarTodos();
    List<Cliente> clientes = repositorioCliente.listarTodos();
   
    
   //List.toRegra( regras.toArray() );
    
   //regras = new ArrayList<Regra>();
    //if(regra : regras){
    	//JOptionPane.showMessageDialog(null,regras);
    //}
	for (Regra regra : regras){
	System.out.println(regra.getPrioridade());
	System.out.println(regra.getOrigem());
	
	//JOptionPane.showMessageDialog(null,"");
	}*/
    
 /*  while(rs2.next() && rs.next()){
   
    	
    	//int pri = rs.getInt("prioridade");
    	String nome = rs.getString("nome"); 
    	String origem = rs.getString("origem");
    	String direcao = rs.getString("direcao");
    	String destino = rs.getString("destino");
    	String protocolo = rs.getString("protocolo");
    	String portaInicial = rs.getString("portaInicial");
    	String portaFinal = rs.getString("portaFinal");
    	String acao = rs.getString("acao");
    	
    	String ori = rs2.getString("origem");
    	String dest = rs2.getString("destino");
    	String prot = rs2.getString("protocolo");
    	String port = rs2.getString("porta");
    	
    	if(direcao.equals( "ENTRADA")){
    		
    		if (origem.equals( "0"))// || origem == 18818703 || origem == 10010004 || origem == 1010010010 || origem == 5555) 
      	   {
      		   JOptionPane.showMessageDialog(null,"Pacote\nOrigem: " + ori + "\nDestino: " + dest+ "\nProtocolo: " + prot + "\nPorta: " + port + "\n--------------\nRegra\nNome: "+nome+"\nOrigem: " + origem + "\nAção: " +acao);
      		   //cont = cont + 1;
      	   }else{
      		   //JOptionPane.showMessageDialog(null, "Origem diferente!");
      	   }
    		
    		if (destino.equals( "0" ))// || origem == 18818703 || origem == 10010004 || origem == 1010010010 || origem == 5555) 
       	   {
    			JOptionPane.showMessageDialog(null,"Pacote\nOrigem: " + ori + "\nDestino: " + dest+ "\nProtocolo: " + prot + "\nPorta: " + port + "\n--------------\nRegra\nNome: "+nome+"\nDestino: " + destino + "\nAção: " +acao);
    			//cont = cont + 1;
       	   }else{
       		   //JOptionPane.showMessageDialog(null, "Ip Destino diferente!");
       	   }
    		
    		if (protocolo.equals( "0" ))// || origem == 18818703 || origem == 10010004 || origem == 1010010010 || origem == 5555) 
        	   {
    			JOptionPane.showMessageDialog(null,"Pacote\nOrigem: " + ori + "\nDestino: " + dest+ "\nProtocolo: " + prot + "\nPorta: " + port + "\n--------------\nRegra\nNome: "+nome+"\nProtocolo: " + protocolo + "\nAção: " +acao);
    			//cont = cont + 1;
        	   }else{
        		  //JOptionPane.showMessageDialog(null, "Protocolo diferente!");
        	   }
    		
    		if (portaInicial.equals( "0" )) // || origem == 10010004 || origem == 1010010010 || origem == 5555) 
     	   {
    			JOptionPane.showMessageDialog(null,"Pacote\nOrigem: " + ori + "\nDestino: " + dest+ "\nProtocolo: " + prot + "\nPorta: " + port + "-Porta Inicial\n--------------\nRegra\nNome: "+nome+"\nPorta Inicial: " + portaInicial + "\nAção: " +acao);
    			//cont = cont + 1;
     	   }else{
     		  // JOptionPane.showMessageDialog(null, "Porta diferente!");
     	   }
    		
    		if (portaFinal.equals( "0" ))// || origem == 10010004 || origem == 1010010010 || origem == 5555) 
      	   {
    			JOptionPane.showMessageDialog(null,"Pacote\nOrigem: " + ori + "\nDestino: " + dest+ "\nProtocolo: " + prot + "\nPorta: " + port + "-Porta Final\n--------------\nRegra\nNome: "+nome+"\nPorta Final: " + portaFinal + "\nAção: " +acao);
    			//cont = cont + 1;
      	   }else{
      		  // JOptionPane.showMessageDialog(null, "Porta diferente!");
      	   }
    		
    	}
    	
    	
    }*/
   //int pri = rs.getInt("prioridade");
	//String origem1 = rs.getString("origem");
	//String destino1 = rs.getString("destino");
	//String protocolo1 = rs.getString("protocolo");
	//String portaInicial1 = rs.getString("portaInicial");
	//String portaFinal1 = rs.getString("portaFinal");
	
   //int id = rs2.getInt("id");
	//String ori1 = rs2.getString("origem");
	//String dest1 = rs2.getString("destino");
	//String prot1 = rs2.getString("protocolo");
	//String port1 = rs2.getString("porta");
	
	//if(!origem1.equals(ori1)){
    //JOptionPane.showMessageDialog(null,"teste"+pri);
	//}
}

	
 
/*catch(SQLException e)  
{  
    // se houve algum erro, uma exceção é gerada para informar o erro   
    e.printStackTrace(); //vejamos que erro foi gerado e quem o gerou  
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}  
finally  
{  
   try   
   {  
      conn.close();  
   }  
   catch(SQLException onConClose)  
   {  
       System.out.println("Houve erro no fechamento da conexão");  
       onConClose.printStackTrace();  
   } 
}*/
 // fim do bloco try-catch-finally  






		/*
		//Criando um novo cliente
		Regra regra = new Regra();
		regra.setPrioridade(1);
		regra.setNome("Regra5");
		regra.setOrigem("222.222.222.222");
		regra.setDestino("111.111.111.111");
		regra.setDirecao("ENTRADA");
		regra.setProtocolo("TCP");
		regra.setPortaInicial("2020");
		regra.setPortaFinal("4040");
		regra.setAcao("PERMITIR");
		regra.setConteudo("testando a criação de uma nova regra");
		
		repositorioRegra.salvar(regra);
		*/
		

		/*
		 //Monstrar dados da tabela(Aqui vai mostrar o campo id)
		List<Regra> regras = repositorioRegra.listarTodos();
		//int aux = 0;
		
		for (Regra regra : regras){
		System.out.println(regra.getPrioridade());
		}
		
		*/
		
		
		
		/*
		// vetor = vetor que queremos ordenar
		int [] vetor = { 9, 5, 7, 2 };

		// aux = variável que usaremos para guardar o maior valor de cada comparação
		int aux = 0;

		// primeiro for = esse for fará com que o a variável i percorra o vetor a ser ordenado, mas ela vai anda 
		 //uma casa enquanto a variável j percorre o vetor todo, ou seja i percorrerá apenas o tamanho do vetor ja 
		  //j percorrerá o tamanho do vetor vezes o tamanho do vetor
		for (int i = 0; i < vetor.length; i++)
		{
		    for (int j = 0; j < vetor.length; j++)
		    {
		        if (vetor[i] < vetor[j])
		        {
		//aqui acontece a troca, do maior cara  vaia para a direita e o menor para a esquerda
		            aux = vetor[i];
		            vetor[i] = vetor[j];
		            vetor[j] = aux;
		        }
		    }
		}

		//esse for é simplesmente para testar a ordenação
		for (int k = 0; k < vetor.length; k++)
		{
		    
		    System.out.println(vetor[k]);
		}

		*/


/*
//Monstrar dados da tabela(Aqui vai mostrar o campo id)
List<Regra> regras = repositorioRegra.listarTodos();


int valor = 1;
int valor2 = 2;

for (Regra regra : regras){
	if(regra.getPrioridade() == valor){
		
		regra.setPrioridade(valor2);
		
		if(regra.getPrioridade() == valor2){
			regra.setPrioridade(valor);
		}
	}
	System.out.println(regra.getPrioridade());
}

*/
		
		/*
		//Atualizando uma Regra
		Regra regra = repositorioRegra.obterPorId(1);
		regra .setNome("Regra");
		
		repositorioRegra.salvar(regra);
		
		System.out.println(regra.getNome());
		*/


//Atualizando uma Regra
//List<Regra> regra;
//regra = repositorioRegra.listarPrioridade();

//if( == 1){

//if(regra != regra.getPrioridade()){
//	neutro = regra.getPrioridade();
//	regra = regra2;
//	regra2 = neutro;
	
//	System.out.println(regra);
//}
//	System.out.println(regra2.getPrioridade());
//}

//repositorioRegra.salvar(regra);

//System.out.println(regra.getPrioridade());
//System.out.println(regra2.getPrioridade());


		

		/*
		 //Removendo da tabela(setar por id)
		Regra regra = repositorioRegra.obterPorId(2);
				
			repositorioRegra.remover(regra);
		*/
	}

	

//}

package com.exemplo.teste;

import java.util.List;

import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;


public class teste {

	public static void main(String[] args) {
		
RepositorioCliente repositorioCliente = new RepositorioCliente();

	
	    
		
		/*
		//Criando um novo cliente
		Cliente cliente = new Cliente();
		cliente.setOrigem("222.222.222.222");
		cliente.setDestino("222.222.222.222");
		cliente.setProtocolo("TCP");
		cliente.setPorta("4040");
		cliente.setDados("testando a cria��o de um novo cliente");
		
		repositorioCliente.salvar(cliente);
		*/
		

		
		 //Monstrar dados da tabela(Aqui vai mostrar o campo id)
		List<Cliente> clientes = repositorioCliente.listarTodos();
		
		for (Cliente cliente : clientes){
		System.out.println(cliente.getId());
		}
		
		
		
		/*Atualizando um cliente
		Cliente cliente = repositorioCliente.obterPorId(40);
		cliente .setPorta("4141");
		
		repositorioCliente.salvar(cliente);
		
		System.out.println(cliente.getDados());
		*/
		
		/*
		 * Removendo da tabela(setar por id)
		Cliente cliente = repositorioCliente.obterPorId(41);
				
			repositorioCliente.remover(cliente);
		*/

/*
// vetor = vetor que queremos ordenar
int [] vetor = { 9, 5, 7, 2 };

// aux = vari�vel que usaremos para guardar o maior valor de cada compara��o
int aux = 0;

// primeiro for = esse for far� com que o a vari�vel i percorra o vetor a ser ordenado, mas ela vai anda                 uma casa enquanto a vari�vel j percorre o vetor todo, ou seja i percorrer� apenas o tamanho do vetor ja             j percorrer� o tamanho do vetor vezes o tamanho do vetor
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

//esse for � simplesmente para testar a ordena��o
for (int k = 0; k < vetor.length; k++)
{
    
    System.out.println(vetor[k]);
}

*/
	}

}

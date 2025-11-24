package prjAula01;

//Importação da Classe Scanner para leitura de dados
import java.util.Scanner;

// Criação da classe CalculaVolume
public class CalculaVolume {

	//Assinatura do método main 
	public static void main(String[] args) {
		
		// criação do objeto in para leitura dos dados
		Scanner in = new Scanner (System.in);
		// criação das variáveis r,h,volume
	  
	     double r,h,volume;
		
		
	     // envio de mensagem na tela para o usuário
	     System.out.println("Ente com o valor do raio");
		 //faz a leitura e guarda na variável raio
	  
	    r= in.nextDouble();
		
		// envio de mensagem na tela para o usuário
		System.out.println("Entre com o valor da altura");
		//faz a leitura e guarda na variável altura
				
				
		h = in.nextDouble();
				
		//calcular o volume e guardar em volume
				
		volume =3.14 * r*r*h;
				
		// mostrar o resultado na tela para o usuário
		System.out.println (" O volume é= " +volume);
				

	}

}

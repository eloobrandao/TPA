package prjAula01;

//Importação da Classe Scanner para leitura de dados
import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main (String [] args) {
		
		
   // criação do objeto in para leitura dos dados
		 Scanner in = new Scanner (System.in);
	// criação das variáveis base, h e area
   
   double base,h,area;
	
	
   // envio de mensagem na tela para o usuário
   System.out.println("Ente com o valor da base do trângulo");
	//faz a leitura e guarda na variável base
   
   base= in.nextDouble();
	
	// envio de mensagem na tela para o usuário
			System.out.println("Entre com o valor da altura do trângulo");
			//faz a leitura e guarda na variável area 
			
			
	h = in.nextDouble();
			
	//calcular a área do triângulo e guardar em area 
			
	area = (base* h)/2;
			
	// mostrar o resultado na tela para o usuário
	System.out.println (" A área do triângulo é= " +area);
			
			
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
	
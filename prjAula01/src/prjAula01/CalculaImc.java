package prjAula01;

//Importação da Classe Scanner para leitura de dados
import java.util.Scanner;

public class CalculaImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  // criação do objeto in para leitura dos dados
	  Scanner in = new Scanner (System.in);
	  // criação das variáveis peso,h,imc
  
     double peso,h,imc;
	
	
      // envio de mensagem na tela para o usuário
      System.out.println("Ente com o valor do peso");
	 //faz a leitura e guarda na variável peso
  
    peso= in.nextDouble();
	
	// envio de mensagem na tela para o usuário
	System.out.println("Entre com o valor da altura");
			//faz a leitura e guarda na variável altura
			
			
	h = in.nextDouble();
			
	//calcular o imc e guardar em imc 
			
	imc = peso/(h*h);
			
	// mostrar o resultado na tela para o usuário
	System.out.println (" O imc é= " +imc);
			
			

	}

}

package prjAula01;

//Importação da Classe Scanner para leitura de dados
import java.util.Scanner;

public class ConverterDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		//Criação das variaveis dia, mes, ano
		double dia,mes,ano;
		
		//envio de mensagem na tela
		System.out.println("Entre com os dias a ser convertidos");
		
		//fazer a leitura e guarda na variavel dia
		dia = in.nextInt();
		
		//Calcular a coversação de dias em mês e guardar na variável mês
		mes = dia/30;
		
		//Calcular a coversação de dias em mês e guardar na variável mês
		ano = mes/12;
		
		
		 System.out.println("Meses: " + mes);
	     System.out.println("Anos: " + ano);



	}

}

package avaliacaoTpa;

import java.util.Scanner;

public class LevantamentoAlunos {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		double i,renda,rendaTotal=0,maiorRenda=0,media=0,somaRenda=0;
		
		for (i=1; i<=40;i++) {
			System.out.println("Entre com o valor da renda");
			renda =in.nextDouble();
			
			rendaTotal= rendaTotal+renda;
			
			if (renda>=maiorRenda) {
				maiorRenda = renda;
			}
			
			somaRenda= somaRenda + renda;
		}
		
		System.out.println("A soma da renda dos 40 alunos é : " + somaRenda);
		
		media= somaRenda/(i-1);
		System.out.println("A média da renda dos 40 alunos é: "+ media);
		
		System.out.println("A Maior renda é: " + maiorRenda);
		
		in.close();
	}
	
}

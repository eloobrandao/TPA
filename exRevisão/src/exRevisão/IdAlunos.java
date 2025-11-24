package exRevisão;

import java.util.Scanner;

public class IdAlunos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int idade1,idade2, idade3, idade4, idade5, maior,menor;
		double porcMaior,porcMenor;
		
		System.out.println("Digite a primeira idade");
		idade1= in.nextInt();
		
		System.out.println("Digite a segunda idade");
		idade2= in.nextInt();
		
		System.out.println("Digite a terceira idade");
		idade3= in.nextInt();
		
		System.out.println("Digite a quarta idade");
		idade4= in.nextInt();
		
		System.out.println("Digite a quinta idade");
		idade5= in.nextInt();
		
		maior = 0;
		menor = 0;
		
		if (idade1 >=18) {
			maior= maior + 1;
			
		}else {
			menor = menor+1;
			
		}if (idade2>=18) {
			maior = maior+1;
			
		}else {
			menor = menor+1;
			
		}if (idade3>=18) {
			maior = maior+1;
			
		}else {
			menor= menor+1;
			
		}if (idade4>=18) {
			maior = maior+1;
			
		}else {
			menor= menor+1;
			
		}if (idade5>=18) {
			maior = maior+1;
			
		}else{
			menor = menor+1;
		}porcMaior =( maior/5.00) *100;
		porcMenor = (menor/5.00)*100;
		
		System.out.println("A quantidade de alunos maiores de idade é:"+ maior );
		System.out.println("A porcentagem de alunos maiores de idade é:"+ porcMaior + "%");
		
		System.out.println("A quantidade de alunos menores de idade é:"+ menor );
		System.out.println("A porcentagem de alunos menores de idade é:"+ porcMenor+ "%");
	}

}

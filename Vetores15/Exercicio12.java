package exComplVetores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 10; //Definindo uma contante de tamanho 10
		int i,a[];
		
		a= new int [TAM];
		
		//Leitura do Vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite a senha do " +(i+1) + "º Aluno ");
			a[i]= in.nextInt();
	    }
		
		//Apresentando a ordem da fila
		System.out.println("Ordem da fila da merenda");
		for(i=0;i<TAM;i++) {
			System.out.println("Aluno " + (i+1) + " senha: " + a[i] );
		}
		in.close();
    }
}
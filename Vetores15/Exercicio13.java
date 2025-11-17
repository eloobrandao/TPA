package exComplVetores;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10; //Definindo uma contante de tamanho 10
		int i, a[],contador=0;
		
		a = new int [TAM];
		
		//Leitura do Vetor A
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "valor");
			a[i]= in.nextInt();
		}
		
		//Descobrindo se é um palíndromo
		for (i=0; i<TAM; i++) {
			if(a[i]==a[TAM-1-i]){
				contador++;
			}
		  }
		if(contador==0) {
			System.out.println("não é um palindromo");
		}else {
			System.out.println("palindromo");
		}
		in.close();
	}

}



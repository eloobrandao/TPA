package exComplVetores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 10; //Definindo uma contante de tamanho 10
		int i,n, a[],contador=0;
		
		a= new int [TAM];
		
		//Leitura do Vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1) + "º valor de A");
			a[i]= in.nextInt();
		}
		System.out.println("Digite o número que deseja encontrar");
		n = in.nextInt();
		
		for (i=0;i<TAM; i++) {
			if(a[i]== n) {
				System.out.println("O número " + n + " foi encontrado na posição " + i + " do vetor");
				contador++;
			}
		}
		
		if (contador==0) {
			System.out.println("O número " + n + " não foi encontrado");
		}
		in.close();
	}

}

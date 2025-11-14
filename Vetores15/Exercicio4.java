package exComplVetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 5;
		int i,j, a[], numPares = 0;
		
		a= new int [TAM];
		
		//Leitura do Vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1) + "º valor");
			a[i]= in.nextInt();
		}
		
		// Apresentando os valores do Vetor A
		System.out.print("A=[");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+",");
		}System.out.println("]");
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("Números pares de 0 até " +a[i] + ":");
			
			for (j=1; j<=a[i];j++) {
				if(j % 2==0) {
				System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}

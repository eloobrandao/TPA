package exComplVetores;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 11;
		int i, j,a[], potencia=1;
		
		a = new int[TAM];
		
		for(i=0; i<TAM;i++) {
			System.out.println("Digite o "+ (i+1)+ "º valor");
			a[i]= in.nextInt();
			
		}
		
		for(i=0; i<TAM; i++) {
			potencia=1;
			for(j=1; j<=a[i]; j++) {
			potencia = potencia *2; 
		   }
			a[i]=potencia;
		}
			
			System.out.print("Vetor A = [");
	        for ( i = 0; i < TAM; i++) {
	            System.out.print(a[i]+ ",");
	        }System.out.print("]");
		

	}

}

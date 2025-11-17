package exComplVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=5; //Definindo uma contante de tamanho 5
		int i, a[],t, n;
		
		a = new int [TAM];
		
		// ler os valores do vetor A
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "valor");
			a[i]= in.nextInt();
		}
		
		//Calculando a tabuada de cada valor do vetor
		 for ( i=0; i<TAM; i++) {
			 
			 System.out.println("\nTabuada do " + a[i] + ":");
		     for (n=1; n<=10; n++) {
			    t= a[i]*n;
			    System.out.println( a[i] +"x"+ n + "=" + t);
		     }
	     }
		in.close();
	 }

}

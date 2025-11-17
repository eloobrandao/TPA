package exComplVetores;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10; //Definindo uma contante de tamanho 10
		int i,j, a[], b[], soma=0;
		
		a = new int[TAM];
		b= new int [TAM];
		
		
		// ler os valores do vetor A
		for (i=0; i <TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor");
			a [i]= in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			soma=0;
			for(j=i; j<TAM;j++) {
				soma= soma+ a[j];
				
				b[i]=soma ;
				
			}
		}
		//Apresentação do Vetor B
		System.out.print("Vetor B = [");
			 for ( i = 0; i < TAM; i++) {
			     System.out.print(b[i]+ ",");
			  }System.out.print("]");

	   in.close();
	}

}

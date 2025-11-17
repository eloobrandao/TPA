package exComplVetores;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 10; //Definindo uma contante de tamanho 10
		int i,j, a[];
		
		a= new int [TAM];
		
		//Leitura do Vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1) + "º valor");
			a[i]= in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Divisores de " +a[i] + ":");
			
			//Calculando os divisores dos respectivos elementos
			for (j=1; j<=a[i];j++) {
				if(a[i] % j==0) {
				System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		in.close();
	}

}

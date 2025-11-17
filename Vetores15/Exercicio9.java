package exComplVetores;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 10; //Definindo uma contante de tamanho 10
		int i,j, a[],b[], c[], k=0;
		
		a= new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//Leitura do Vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1) + "º valor de A");
			a[i]= in.nextInt();
		}
		
		//Leitura do Vetor B
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1) + "º valor de B");
			b[i]= in.nextInt();
		}
		
		// Vereficando a interseção dos conjuntos
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i] == b[j]) {
					c[k]=a[i];
					k++;
				}
			}
		}
		//Apresentação do Vetor C
	    System.out.print("[");
		for (i=0; i< k; i++) {
			System.out.print(c[i] + " " );
		}System.out.print("]");
		
		in.close();
	}

}

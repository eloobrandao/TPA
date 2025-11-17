package exComplVetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 15; //Definindo uma contante de tamanho 15
		int i,j,a[], b[],f=1;
		
		a= new int [TAM];
		b= new int [TAM];
		
		//Leitura dos valores do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor");
			a [i]= in.nextInt();
		}
		
		// Calculando o fatorial de cada elemnto do vetor A
		for(i=0; i<TAM; i++) {
			f=1;
			for (j=1; j<=a[i];j++) {
				f = f*j;
			}
			b[i]=f;
		}
		
		//Apresentação do Vetor A
		System.out.print("Vetor A = [");
        for ( i = 0; i < TAM; i++) {
            System.out.print(a[i]+ ",");
        }System.out.print("]");
		
        // Apresentação do Vetor B
		System.out.print("Vetor B = [");
        for ( i = 0; i < TAM; i++) {
            System.out.print(b[i]+ ",");
        }System.out.print("]");

        in.close();
	}

}

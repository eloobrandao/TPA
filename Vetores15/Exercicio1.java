package exComplVetores;

import java.util.Scanner;

public class Exercicio1 {


	public static void main(String[] args) {
	
	
		Scanner in = new Scanner (System.in);
		final int TAM = 20; //Definindo uma contante de tamanho 10
		int i, a[], b[],par =0,impar=0;
		
		a = new int[TAM];
		b= new int [TAM];
		
		
		// ler os valores do vetor A
		for (i=0; i <TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor");
			a [i]= in.nextInt();
		}
		//verificando se o número par
		for (i=0; i<TAM; i++) {
			if(a[i]%2==0) {
				b[par]=a[i];
				par++;
			}
		}
		
		impar=par;
		//Vereficando se o número é impar
		for (i=0; i<TAM; i++) {
			if(a[i]%2!=0) {
				b[impar]=a[i];
				impar++;
			}
		}
		
		// Apresentando os valores do vetor B, começando pelo par e depois o impar
		System.out.print("Vetor B = [");
        for ( i = 0; i < TAM; i++) {
            System.out.print(b[i]+ ",");
        }System.out.print("]");
	}
}

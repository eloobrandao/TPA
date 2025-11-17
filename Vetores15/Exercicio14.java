package exComplVetores;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10; //Definindo uma contante de tamanho 10
		int i, a[], b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		//Leitura do Vetor A
		for (i=0; i <TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor");
			a [i]= in.nextInt();
		}
		
		for (i=0;i<TAM; i++) {
			if(a[i]%2==0 && a[i]>0) {
				b[i]=1;
			}else {
				b[i]=0;
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

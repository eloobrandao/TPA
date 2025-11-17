package exComplVetores;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10; //Definindo uma contante de tamanho 10
		int i, a[], b[], c[];

		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//Leitura do Vetor A
		for (i=0; i <TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor Vetor A");
			a [i]= in.nextInt();
		}
		
		//Leitura do Vetor B
		for (i=0; i <TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor do Vetor B");
			b [i]= in.nextInt();
		}
		
		for (i=0;i<TAM; i++) {
			if(a[i]>b[i]){
				c[i]=1;
			}else if(a[i]==b[i]) {
				c[i]=0;
			}else {
				c[i]=-1;
			}
		}
		//Apresentação do Vetor C
		System.out.print("Vetor C = [");
        for ( i = 0; i < TAM; i++) {
            System.out.print(c[i]+ ",");
        }System.out.print("]");
        
        in.close();
	}
}

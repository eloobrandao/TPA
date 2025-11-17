package exComplVetores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 10;
		int i,j, a[], divisores=0;
		
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
		
		// Vereeficando se os números são primos
		for(i=0; i<TAM; i++) {
			divisores=0;
			for (j=1;j<=a[i];j++) {
				
				if(a[i]% j==0) {
				divisores++;
				}
			}
			if (divisores ==2) {
				System.out.println( a[i]+ " é primo");
			}else {
				System.out.println( a[i]+ " não é primo");
			}
			
		}
		in.close();
	}
		
		
}
	
	
		
		
		
	
		

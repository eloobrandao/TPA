package exComplVetores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 2; //Definindo uma contante de tamanho 10
		int i,j,a[],senha;
		
		a= new int [TAM];
		
	
		//Leitura do Vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite a senha do " +(i+1) + "º Aluno ");
			senha= in.nextInt();
			
			boolean existe = false;
			
			for(j=0; j< i; j++) {
				if (a[j] == senha) {
					existe = true;
					break;
				}
			}
			
			if(existe) {
				System.out.println("Essa senha já foi usada! Digite outra.\n");
				i--;
			}else {
				a[i]= senha;
			}
	    }
		
		System.out.println(" ORDEM DA FILA DA MERENDA\n");
		
		for(i=0;i<TAM;i++) {
			System.out.println("Aluno " + (i+1) + "-> senha: " + a[i]);
		}

		}
		
 
}
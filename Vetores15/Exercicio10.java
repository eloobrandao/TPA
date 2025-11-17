package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 final int TAM = 10;
		 int i, j, k = 0;

	        int a[] = new int[TAM];
	        int b[] = new int[TAM];
	        int c[] = new int[TAM];

	        // Ler vetor A
	        for (i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i+1) + "º valor do vetor A");
	            a[i] = in.nextInt();
	        }

	        // Ler vetor B
	        for (i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i+1) + "º valor do vetor B");
	            b[i] = in.nextInt();
	        }

	        // Diferença: A - B
	        for (i = 0; i < TAM; i++) {

	            int existe = 0;

	            for (j = 0; j < TAM; j++) {
	                if (a[i] == b[j]) {
	                    existe = 1;
	                    break;
	                }
	            }

	            if (existe == 0) {
	                c[k] = a[i];
	                k++;
	            }
	        }

	        // Exibir vetor C
	        System.out.println("\nDiferença (A - B):");
	        for (i = 0; i < k; i++) {
	            System.out.println(c[i]);
	        }
	   }
	
}


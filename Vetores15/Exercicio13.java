package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        final int TAM = 10;
	        int i, ehPalindromo = 1;

	        int a[] = new int[TAM];

	        // Leitura do vetor
	        for (i = 0; i < TAM; i++) {
	            System.out.println("Digite o " + (i+1) + "º valor do vetor A");
	            a[i] = in.nextInt();
	        }

	        // Verificação
	        for (i = 0; i < TAM/2; i++) {
	            if (a[i] != a[TAM - 1 - i]) {
	                ehPalindromo = 0;
	                break;
	            }
	        }

	        if (ehPalindromo == 1) {
	            System.out.println("O vetor é palíndromo.");
	        } else {
	            System.out.println("O vetor NÃO é palíndromo.");
	        }
	    }
}


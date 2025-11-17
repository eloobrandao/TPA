package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
        int i;

        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int c[] = new int[TAM];

        // Ler A
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        // Ler B
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor B");
            b[i] = in.nextInt();
        }

        // Construir C
        for (i = 0; i < TAM; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }

        // Exibir C
        System.out.println("\nVetor C:");
        for (i = 0; i < TAM; i++) {
            System.out.println(c[i]);
        }
    }
}


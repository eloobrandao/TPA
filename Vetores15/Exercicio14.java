package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
        int i;

        int a[] = new int[TAM];
        int b[] = new int[TAM];

        // Ler valores de A
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        // Formando B
        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        // Exibir B
        System.out.println("\nVetor B:");
        for (i = 0; i < TAM; i++) {
            System.out.println(b[i]);
        }
    }
}



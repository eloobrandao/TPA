package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
        int i, x, encontrado = 0;

        int a[] = new int[TAM];

        // Leitura do vetor
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor A");
            a[i] = in.nextInt();
        }

        System.out.println("Digite o valor X para buscar:");
        x = in.nextInt();

        // Busca
        for (i = 0; i < TAM; i++) {
            if (a[i] == x) {
                encontrado = 1;
                break;
            }
        }

        if (encontrado == 1) {
            System.out.println("X está no vetor.");
        } else {
            System.out.println("X NÃO está no vetor.");
        }
    }
}



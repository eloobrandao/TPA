package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
        int i;

        int fila[] = new int[TAM];

        // Ler as senhas
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite a senha " + (i+1));
            fila[i] = in.nextInt();
        }

        // Chamando a fila
        System.out.println("\nChamando as senhas:");
        for (i = 0; i < TAM; i++) {
            System.out.println("Senha chamada: " + fila[i]);
        }
	}

}

package vetores;
import java.util.Scanner;
public class ExercicioVetor1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10; //Definindo uma constante de tamanho 10
		int i,a[],b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		//Leitura do vetor e Calculo do Vetor B

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+ " valor do vetor A");
			a[i]= in.nextInt();
			b[i] = a[i]*a[i];
		}
		
		// Apresentação do vetor B
		
		System.out.print("B=[");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+",");
		}
		System.out.print("]");
		

	}

}

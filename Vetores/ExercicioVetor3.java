package vetores;
import java.util.Scanner;
public class ExercicioVetor3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i,a[],b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		//Leitura do vetor A e Calculo do vetor B
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+ " o valor de A");
			a[i]=in.nextInt();
			b[0]=a[9];
			b[1]=a[8];
			b[2]=a[7];
			b[3]=a[6];
			b[4]=a[5];
			b[5]=a[4];
			b[6]=a[3];
			b[7]=a[2];
			b[8]=a[1];
			b[9]=a[0];

        }
		//Apresentação do vetor B
		System.out.print("B=[");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+",");
		}
		System.out.print("]");

	}

}

package vetores;
import java.util.Scanner;
public class ExercicoVetor2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i,a[],b[],c[];
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//Leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+ " valor A");
			a[i]= in.nextInt();
			
		}
		//Apresentação do vetor A
		System.out.print("A=[");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print("]");
		
		System.out.println("  ");
		
		//Leitura do vetor B e Calculo do vetor C
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+ " valor B");
			b[i]= in.nextInt();
			c[i]= a[i]+b[i];
		}
		//Apresentação do vetor B
		System.out.print("B=[");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+",");
		}
		System.out.print("]");
		
		System.out.println("  ");
		
		//Apresentação do vetor C
		System.out.print("C=[");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+",");
		}
		System.out.print("]");
		
		
		
		
		
		
	}

}

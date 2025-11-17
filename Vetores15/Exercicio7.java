package exerciciosComplementares;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM= 15;
		int i,j,f=1,a[], b[];
		
		a= new int [TAM];
		b= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1)+ " valor");
			a [i]= in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			f=1;
			for (j=1; j<=a[i];j++) {
				f = f*j;
			}
			b[i]=f;
		}
		
		System.out.print("Vetor A = [");
        for ( i = 0; i < TAM; i++) {
            System.out.print(a[i]+ ",");
        }System.out.print("]");
		
		System.out.print("Vetor B = [");
        for ( i = 0; i < TAM; i++) {
            System.out.print(b[i]+ ",");
        }System.out.print("]");

	}


}

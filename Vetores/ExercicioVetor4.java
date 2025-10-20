package vetores;
import java.util.Scanner;
public class ExercicioVetor4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i,a[],soma =0,media;
		
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " +(i+1)+ " o valor de A");
			a[i]= in.nextInt();
			soma = soma+a[i];
			
		}
		media= soma/TAM;
		System.out.println("A soma dos vetores é: " +soma);
		System.out.println("A média da soma dos vetores de A é: " +media);
		

	}

}

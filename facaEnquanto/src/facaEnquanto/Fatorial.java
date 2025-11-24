package facaEnquanto;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int n =in.nextInt();
		
		int i = 1;
		int f = 1;
		
		do {
			f = f*i;
			i++;
		}while(i<=n);
		
		System.out.println(" O fatorial de número " + n +  " é igual a : "+f);
	
	}

}

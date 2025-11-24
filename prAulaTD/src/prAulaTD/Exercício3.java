package prAulaTD;
import java.util. *;
public class Exercício3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double f,c;
		
		System.out.println ("Digite o valor da temperatura em fahrenheit");
		f= in.nextDouble();
		 
		c = (f-32)* 5/9;
		 System.out.println ( "A temperatura em graus celsius é " + c);
		
		if (c <15) {
			System.out.println ("Frio");
		
		}else if (c >= 15) {
			System.out.println ("Amena");
		
		} else if ( c> 22) {
			System.out.println("Quente");
		
		}in.close();

	}

}

import java.util.*;
public class Idade {
	
	public static void main (String args []) {
		
		Scanner in = new Scanner (System.in);
		double anoNasc, anoAtual, idade ;
		
		System.out.println("Digite o ano de nascimento");
		anoNasc =in.nextInt();
		System.out.println("Digite o ano atual");
		anoAtual =in.nextInt();
		idade = anoAtual- anoNasc ;
		
		System.out.println("Idade=" + idade);
		if (idade>17) { 
		      System.out.println("Maior de idade!");
	} else {
		  System.out.println("Menor de idade!");
	}in.close();

}
}
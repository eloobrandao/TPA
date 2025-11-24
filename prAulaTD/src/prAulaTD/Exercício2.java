package prAulaTD;
import java.util.*;
public class Exercício2 {

	public static void main(String[] args) {
	   
	Scanner in = new Scanner (System.in);
	double n;
	
	System.out.println ("Digite um número");
	n = in.nextDouble();
	
	if (n==0) {
		System.out.println ("Neutro");
	
	}else if (n <0) {
		System.out.println ("Negativo");
	
	} else {
		System.out.println ("Positivo");
	
	}in.close();

	}

}

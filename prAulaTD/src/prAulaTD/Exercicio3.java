package prAulaTD;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		double f, c ;
		
		System.out.println ("Digite uma temperatura em fahrenheit");
		f = in.nextDouble();
		c = (f - 32)/1.8;
		
		System.out.println("a temperatura em graus celsius é:"+ c);
		
		if(c < 15) {
			System.out.println("Frio");
		} else if ((c>=15) && (c<22)){
			System.out.println("Ameno");
		} else {
			System.out.println("quente");
		} in.close();
		
		
		}

	
	}


package prjLacoInicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	 
	int n, i=1, t;
	System.out.println("Digite um numero inteiro");
	n = in.nextInt();
	
	while (i<=10) {
		t= n*i;
		System.out.println(n + "x" +i +"="+t);
		 
		i++;
	   }
	}

}

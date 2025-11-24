package prjLacoInicio;

import java.util.Scanner;

public class SomaNum {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i=0,s=0;
		
		System.out.println("Este programa apresenta a somatória dos numeros de 1 a 100");
		 while (i<=100) {
		 s = s+i;
		
		 i++;
	} 
		 System.out.println("a somatória é :"+ s);
	}

}

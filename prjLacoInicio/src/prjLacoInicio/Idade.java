package prjLacoInicio;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int id,i=1,maior =0, menor=0;
		
		while (i<=5) {
		System.out.println("Digite a idade da pessoa"+ i+ ":");
		id =in.nextInt();
		
		if (id<18) {
			menor= menor +1;
		}else {
			maior = maior+1;
		 }
		 i++;
		} System.out.println("Maiores de idade :"+ maior);
		System.out.println("Menores de idade:"+ menor);

	}

}

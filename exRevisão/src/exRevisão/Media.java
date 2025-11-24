package exRevisão;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	 double n1,n2,n3,n4,mi,ex,nova;
	    
	    System.out.println("digite a primeira nota");
		n1= in.nextDouble();
		
		System.out.println("digite a segunda nota");
		n2= in.nextDouble();
		
		System.out.println("digite a terceira nota");
		n3= in.nextDouble();
		
		System.out.println("digite a quarta nota");
		n4= in.nextDouble();
		
		mi = (n1+n2+n3+n4)/4;
		System.out.println("a media é :"+mi);
		 if (mi<5) {
			 System.out.println("Reprovado");
		 }else if (mi>=7) {
			 System.out.println("Aprovado");
		 }else {
			 System.out.println("O aluno esta em exame");
			 System.out.println("digite a nota do exame");
			 ex= in.nextDouble();
			 nova= (mi + ex)/2;
				
		 } if (nova>=7) {
			 System.out.println("Aprovado após o exame");
		 }else {
			 System.out.println("Reprovado após o exame");
		 }in.close();

		}

	}


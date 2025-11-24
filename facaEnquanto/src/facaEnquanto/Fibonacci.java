package facaEnquanto;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		 int n;
		 int i=1;
		 int f =1;
		 int a = 1;
		 int b = 1;
		 
		 System.out.println("Digite o numero de termos");
		 n = in.nextInt();
	
		 do {  
			 
			 if(n<3){
				  System.out.println(1);
				  System.out.println(1);
			  }else {
				  
			 a= f-1;
			 b= f-2;
			 f = b+a;
			 System.out.println(f);
		 i++;
			  }
		 }while(i <=n);
		 
		 } 
	}

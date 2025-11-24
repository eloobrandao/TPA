import java.util.*;
public class tipoTriangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a,b,c ;
   
		System.out.println("digite o valor do lado a");
	    a= in.nextDouble();
	
	    System.out.println("digite o valor do lado b");
	    b= in.nextDouble();
	
	    System.out.println("digite o valor do lado c");
	    c= in.nextDouble();
	    
	    if (a>b+c || b>a+c  || c>b+a) {
	       System.out.println("Nâo forma um triângulo");
	
	    }else if(a==b & b==c) {
		   System.out.println("Triângulo Equilátero");
		
	    }else if (a !=b & a!=c & b!=c) {
		   System.out.println("Triângulo Escaleno");
	    }else {
		   System.out.println("Triângulo Isóceles");
	}in.close();

   }
}

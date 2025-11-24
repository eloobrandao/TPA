import java.util.*;
public class ordemCresc {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	double a,b,c;
	 System.out.println("digite o valor do lado a");
		a= in.nextDouble();
		
		System.out.println("digite o valor do lado b");
		b= in.nextDouble();
		
		System.out.println("digite o valor do lado c");
		c= in.nextDouble();
		
		if(a<b && b<c) {
			System.out.println("A ordem crescente é: " + a + ", " + b + ", " + c);
		}else if (a<c && c<b) {
			System.out.println("A ordem crescente é: " + a + ", " + c+ ", " + b);
		}else if (b<a && a <c) {
			System.out.println("A ordem crescente é: " + b+ ", " + a + ", " + c);
		}else if (b<c && c<a) {
			System.out.println("A ordem crescente é: " + b + ", " + c+ ", " + a);
		}else if (c<a && a<b) {
			System.out.println("A ordem crescente é: " + c + ", " + a + ", " + b);
		}else {
			System.out.println("A ordem crescente é: " + c + ", " + b + ", " + a);
		}in.close();

	}

}

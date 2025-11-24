import java.util.*;
public class equacao2Grau {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a,b,c,x1,x2,d;
		System.out.println("digite o valor de a");
		a= in.nextDouble();
		
		System.out.println("digite o valor de b");
		b= in.nextDouble();
		
		System.out.println("digite o valor de c");
		c= in.nextDouble();
		
		d= (b*b)-4*a*c;
		System.out.println("O delta é igual á"+d);
		
		if(d<0) {
			System.out.println("Não existe raiz");
		}else if (d ==0){
			x1= -b/(2*a);
			System.out.println("a raiz é:"+ x1);
		}else{
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 =(-b- Math.sqrt(d))/(2*a);
			System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
		}in.close();
		

	}

}

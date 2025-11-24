package prAulaTD;
import java.util.*;
public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		double salario;
		
		System.out.println ("Digite o valor do salario");
		salario = in.nextDouble();
		
		if (salario < 1302) {
		      System.out.println("Abaixo");
		}else {
			System.out.println ("Acima");
		}in.close();
		

	}

}

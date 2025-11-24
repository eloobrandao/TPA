import java.util.*;
public class calculaImc {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double p,h,imc ;
		
		System.out.println ("Digite o valor do peso");
		p = in.nextDouble();
		System.out.println ("Digite o valor da altura");
		h = in.nextDouble();
		imc = p/(h*h);
		
		System.out.println("o imc é igual a :"+ imc);
		
		if(imc<18.5) {
			System.out.println("Excesso de magreza");
		} else if (imc<25){
			System.out.println("peso normal");
		} else if (imc<30) {
			System.out.println("Excesso de peso");
		} else if (imc<35) {
			System.out.println("Obesidade grau i");
		} else if (imc<40){
			System.out.println ("Obesidade grau ii");
		}else {
			System.out.println ("Obesidade grau iii");
		}in.close();
	}
}
		
		
	

import java.util.*;
public class Temperatura {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		double f, c ;
		
		System.out.println ("Digite uma temperatura em fahrenheit");
		f = in.nextDouble();
		c = (f - 32)/1.8;
		
		System.out.println("a temperatura em graus celsius é:"+ c);
		
		if(c < 0) {
			System.out.println("Frio extremo !");
		} else if (c<10){
			System.out.println("Frio !");
		} else if (c<20) {
			System.out.println("Frio moderado!");
		} else if (c<24) {
			System.out.println("Clima ameno!");
		} else {
			System.out.println ("Calor!");
		}in.close();
		
		
		}

	
	}





import java.util.*;
public class ImparPar {
    public static void main (String args [] ) {
    	Scanner in = new Scanner (System.in);
    	int n ;
    	
    	System.out.println ("Digite um numero");
    	n = in.nextInt();
    	if (n % 2 == 0) {
    	System.out.println("O numero é par!");
    	
    } else {
    	System.out.println("O numero é impar!");
    }in.close();
}
}


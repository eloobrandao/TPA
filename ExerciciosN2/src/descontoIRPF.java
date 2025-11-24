import java.util.*;
public class descontoIRPF {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
    double sal,ir,parc,imp;
    
    System.out.println("digite o valor do salário");
   	sal= in.nextDouble();
   	
   	if (sal <= 1434.59) {
   	 ir= 0;
   	 parc = 0;
   	}else if(sal<=2150){
   		ir = 7.5;
   		parc= 107.59;
   	}else if (sal<= 2866.70) {
   		ir = 15;
   		parc =268.84;
   	}else if (sal<= 3582) {
   		ir = 22.5;
   		parc = 483.84;
   	}else {
   		ir = 22.5;
   		parc = 662.94;
   	} imp= (sal/100*ir)-parc;
 	 System.out.println("O imposto devido é :"+ imp);
   	 
 	
	}

}

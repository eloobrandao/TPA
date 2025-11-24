package exercicioMesDiaAno;

import java.util.Scanner;

public class DiaSeguinte {

	public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
    
      int dia,mes,ano, diasMes = 0;
    
      System.out.println("Digite o dia");
      dia =in.nextInt();
    
      System.out.println("Digite o mês");
      mes =in.nextInt();
    
      System.out.println("Digite o ano");
      ano =in.nextInt();
      
      //verificando se o dia e o mês são validos
      if(dia<=31 && mes<=12 && dia>0 ) {
    
    //Determinando a quantidade de dias de cada mês
        switch(mes) {
           case 2:
        	   if(ano%4==0) {
        		   diasMes=29;

     
        	   }else {
        	   diasMes=28;
        	   }
  
        	   break;
           case 4:
           case 6:
           case 9:
           case 11:
        	   diasMes=30;
        	   break;
        	   
           default:
        	   diasMes=31;
        	   
     	     
      }
      // verificando o dia do mês existe 
        if(dia>diasMes) {
    	  System.out.println("A data é inválida");
      }else {
      
        // Calculando o dia seguinte
      if(dia<diasMes) {
         dia=dia+1;
        	    	  
       }else {
         dia=1;
         mes+=1;  
          }if(mes>12) {
        	 mes=1;
        	 ano+=1;
         }
      
        	   System.out.println("O dia seguinte será: " + dia +"/"+  mes + "/"+ ano);
        }
        
      }else {
    	  System.out.println("A data é inválida");
      }
      
      in.close();
	}
}


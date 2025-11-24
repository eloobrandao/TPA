package prjLacoIPara;

import java.util.Scanner;

public class IdadeAlturaPeso {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int id,peso, maior50 =0,maior=0,menor=0;
		
		double porc,h,media=0, pesoInferior=0,somaH=0, totalH=0,i;
		
		
		for ( i=1; i<=3;i++) {
		
			System.out.println("Digite a idade da pessoa:" + i);
			id = in.nextInt();
			
			
			if (id>50) {
				maior50 = maior50+ 1;
				}
			
			if(i==1) {
				maior=id;
				menor=id;
			}

			if(id>maior) {
				maior=id;
			}
			if (id<menor) {
				menor=id;
			}
			
			System.out.println("Digite a Altura da pessoa:" + i);
			h = in.nextDouble();
			
			if (id>=10 && id<=20){
				somaH = somaH + h;
				totalH =totalH +1;
				}
			
			System.out.println("Digite o peso da pessoa :" + i);
			peso = in.nextInt();
			
			if (peso<40) {
				pesoInferior = pesoInferior + 1;
			}
		}
	
		
		
		  System.out.println("A quantidade de pessoas com idade superior a 50 anos é :" + maior50);
		    
		   
		   if (totalH> 0) {
		       media = somaH/ totalH;
		       System.out.println("Média de altura (10 a 20 anos):" + media);
		   } else {
		       media = 0;
		   }
		    
		    porc = (pesoInferior /(i-1)) *100;
		    System.out.println( "A porcentagem  de pessoas com o peso inferior a 40 é :" + porc + "%");
		    
		    System.out.println("a maior idade é: " + maior);
		    System.out.println("a menor idade é: " + menor);
		    
      in.close();
    }
  }


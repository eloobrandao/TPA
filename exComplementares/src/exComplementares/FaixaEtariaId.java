package exComplementares;

import java.util.Scanner;

public class FaixaEtariaId {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int id, r,i=0;
		double  pri =0,seg =0,ter=0,quar=0,qui=0;
		double porc1,porc2,porc3,porc4,porc5;
		
		do {
		System.out.println("Digite a idade");
		id = in.nextInt();
		
		if(id<=15) {
			System.out.println("1a Faixa Etária");
			pri= pri + 1;
			
		}else if(id<=30){
			System.out.println("2a Faixa Etária");
			seg = seg + 1;
			
		}else if (id <= 45) {
			System.out.println("3a Faixa Etária");
			ter = ter +1;
			
		}else if (id<=60) {
			System.out.println("4a Faixa Etária");
			quar = quar +1;
		}else {
			System.out.println("5a Faixa Etária");
			qui = qui +1;
		}
		
		
		System.out.println("Deseja continuar a execucão ? (1-Sim / 2-Não)");
		r = in.nextInt();
		
		i++;
		}while (r==1);
		
		
		System.out.println("Quantidade de pessoas em cada faixa etária");
		
		System.out.println("1a Faixa Etária:" + pri);
		System.out.println("2a Faixa Etária:" + seg);
		System.out.println("3a Faixa Etária:" + ter);
		System.out.println("4a Faixa Etária:" + quar);
		System.out.println("5a Faixa Etária:" + qui);
		
		
		System.out.println(" Em Porcentagem:");
		
		porc1 = (pri/i)*100;                     
		System.out.println("1a Faixa Etária:" + porc1 + "%");
		
		porc2 = (seg/i)*100;
		System.out.println("2a Faixa Etária:" + porc2 + "%" );
		
		porc3 = (ter/i)*100;
		System.out.println("3a Faixa Etária:" + porc3 + "%" );
		
		porc4 = (quar/i)*100;
		System.out.println("4a Faixa Etária:" + porc4 + "%" );
		
		porc5 = (qui/i)*100;
		System.out.println("5a Faixa Etária:" + porc5 + "%" );  
		
		
		
	}

}

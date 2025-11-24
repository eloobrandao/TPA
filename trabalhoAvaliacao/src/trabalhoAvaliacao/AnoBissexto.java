package trabalhoAvaliacao;
import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1;
		int anoI,anoF,bissexto=0,totalAno;
		
		System.out.println("Digite o ano inicial");
		anoI = in.nextInt();
		
		System.out.println("Digite o ano final");
		anoF = in.nextInt();
		
		totalAno= anoF-anoI;
		
		while(i<=totalAno){
			
			if(anoI%4==0) {
				bissexto=bissexto+1;
				System.out.println("O ano bissexto é: "+anoI);
			}
			anoI=anoI+1;
			i++;
		} 
		
		System.out.println("Total de anos bissextos: " +bissexto);
	}

}

import java.util.*;
public class CalculaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int idade, anoA, anoN;
		
		System.out.println("Digite o ano atual!");
		anoA = in.nextInt();
		
		System.out.println("Digite o ano do nascimento!");
		anoN = in.nextInt();
		
		idade= anoA-anoN;
		System.out.println("A idade é :"+ idade);
		
		if(idade<10) {
			System.out.println("Criança");
		}else if (idade<18) {
			System.out.println("Adolescente");
		}else if (idade<60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}in.close();
		
	}

}

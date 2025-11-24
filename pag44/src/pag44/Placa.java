package pag44;
import java.util.Scanner;
public class Placa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nPlaca;
		System.out.println("Digite o último número da placa do veículo");
		nPlaca = in.nextInt();
		
		switch(nPlaca) {
		case 1:
		case 2:
			System.out.println("Não poderá circular segunda-feira nas ruas de São Paulo, devido o rodizio");
			break;
		case 3:
		case 4:
			System.out.println("Não poderá circular terça-feira nas ruas de São Paulo, devido o rodízio.");
			break;
		case 5:
		case 6:
			System.out.println("Não poderá circular quarta-feira nas ruas de São Paulo, devido o rodízio.");
			break;
		case 7:
		case 8:
			System.out.println("Não poderá circular quinta-feira nas ruas de São Paulo, devido o rodízio.");
			break;
		case 9:
		case 0:
			System.out.println("Não poderá circular sexta-feira nas ruas de São Paulo devido o rodízio.");
			break;
		default:
			System.out.println("Placa Invalida");
		
			
		}
		
	}

}

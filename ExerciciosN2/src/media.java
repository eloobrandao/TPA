import java.util.*;
public class media {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
    double n1,n2,n3,m;
    
    System.out.println("digite a primeira nota");
	n1= in.nextDouble();
	
	System.out.println("digite a segunda nota");
	n2= in.nextDouble();
	
	m = (n1+n2)/2;
	System.out.println("a media é :"+m);
	 if (m<3) {
		 System.out.println("Reprovado");
	 }else if (m>=6) {
		 System.out.println("Aprovado");
	 }else if (m>=3 && m<6) {
		 System.out.println("O aluno esta em exame");
		 System.out.println("digite a nota do exame");
		 n3= in.nextDouble();
		 m = (m + n3)/2;
		 System.out.println("A nova média é:"+m);
			
	 }if (m>=6) {
		 System.out.println("Aprovado após o exame");
	 }else {
		 System.out.println("Reprovado após o exame");
	 }in.close();

	}

}

import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao13_ResultadoDivisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println("Insira um valor para realiza��o da divis�o: ");
		double n1 = sc.nextDouble();
		System.out.println("Insira o segundo valor: ");
		double n2 = sc.nextDouble();
		
		double divisao = n1/n2;
		
		if (n1 == 0) {
			
			System.out.println("N�o existe divis�o por 0!!!");
			
		}
		else if (n2 == 0) {
			
			System.out.println("N�o existe divis�o por 0!!!");
			
		}
		
		else {
			
			System.out.println("O resultado da divis�o �: " + df.format(divisao));
			
		}
		
		sc.close();

	}

}

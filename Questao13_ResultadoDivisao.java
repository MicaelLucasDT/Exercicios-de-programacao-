import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao13_ResultadoDivisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println("Insira um valor para realização da divisão: ");
		double n1 = sc.nextDouble();
		System.out.println("Insira o segundo valor: ");
		double n2 = sc.nextDouble();
		
		double divisao = n1/n2;
		
		if (n1 == 0) {
			
			System.out.println("Não existe divisão por 0!!!");
			
		}
		else if (n2 == 0) {
			
			System.out.println("Não existe divisão por 0!!!");
			
		}
		
		else {
			
			System.out.println("O resultado da divisão é: " + df.format(divisao));
			
		}
		
		sc.close();

	}

}

import java.util.Scanner;

public class TesteOperadorTernario2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		double num1 = sc.nextDouble();

		System.out.println("Insira outro n�mero: ");
		double num2 = sc.nextDouble();
		
		double soma = num1 + num2;
		
		double resultado = (soma >= 20) ? soma + 10 : soma -5;
				
		System.out.printf("O resultado �: %.2f ", resultado);     //%s = String
																//%d = inteiro
																//%f = Ponto Flutuante
																//No printf ser� impresso dois valores, tendo o primeiro sendo sempre uma String
		
		sc.close();
	}

}

      // O ? significa "ent�o" 
	  // O : significa "sen�o"	
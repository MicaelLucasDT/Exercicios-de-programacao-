import java.util.Scanner;

public class ProgramaParaUsar4Operacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira -999 para finalizar:");
		int fim = sc.nextInt();
		
		System.out.println("Informe um valor:");
		int num1 = sc.nextInt();
		System.out.println("Infome outro valor:");
		int num2 = sc.nextInt();
		System.out.println("Qual a operação desejada? ( +, -, *, / )");
		String OP = sc.next();
		
		
		
		do {
		
		switch (OP) {
		case "+":
			
			int soma = num1 + num2;
			System.out.println("A soma é: " + soma);
			if(soma == 0) {
				
				System.out.println("O valor é igual a 0");
			}
			break;
			
		case "-":
			
			int sub = num1 - num2;
			System.out.println("A subtração é: " + sub);
			break;
		
		case "*":
			
			int multi = num1 * num2;
			System.out.println("A multiplicação é: " + multi);
			break;
			
		case "/":
			
			int div = num1 / num2;
			System.out.println("A divisão é: " + div);
			break;
			
		default:
			System.out.println("Operação inválida!!! ");
			
		}fim++;
		
		} while(fim != -999);
		System.out.println("Programa finalzado!");
		
		

	}
}

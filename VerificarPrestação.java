import java.util.Scanner;

public class VerificarPrestação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("Qual seu salário? ");
		double salario = sc.nextDouble();
		
		System.out.println("Qual o valor de prestação desejado? ");
		double prestacao = sc.nextDouble();
		
		double SalarioDesconto = (salario * 30) / 100;
			
		
		if ( SalarioDesconto > prestacao ) {
			
			System.out.println("Olá, " + nome + "! Sua prestação foi Aprovada!");
		
		}
		else{
			
			System.out.println("Olá, " + nome + "! Sua prestação foi Recusada!");
		
		}
		
		sc.close();
		
	}

}

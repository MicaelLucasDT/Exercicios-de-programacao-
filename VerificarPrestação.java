import java.util.Scanner;

public class VerificarPresta��o {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("Qual seu sal�rio? ");
		double salario = sc.nextDouble();
		
		System.out.println("Qual o valor de presta��o desejado? ");
		double prestacao = sc.nextDouble();
		
		double SalarioDesconto = (salario * 30) / 100;
			
		
		if ( SalarioDesconto > prestacao ) {
			
			System.out.println("Ol�, " + nome + "! Sua presta��o foi Aprovada!");
		
		}
		else{
			
			System.out.println("Ol�, " + nome + "! Sua presta��o foi Recusada!");
		
		}
		
		sc.close();
		
	}

}

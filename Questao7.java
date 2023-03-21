import java.util.Scanner;


public class Questao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double gasolina = 3.79;
		double  alcool = 2.90;
		
		System.out.println("Qual o combustível? (Gasolina ou Álcool) ");
		String TPcombustivel = sc.nextLine();
		System.out.println("Quantos litros deseja abastecer? ");
		double quantidade = sc.nextDouble();
		
		if ("Gasolina".equals(TPcombustivel)){
			
			double valor = (gasolina * quantidade);
			System.out.println("Total a pagar: " + valor);
		}
		
		else if ("Alcool".equals(TPcombustivel)) {
			
			double valor2 = (alcool * quantidade);
			System.out.println("Total a pagar: " + valor2);
		}
		
		
		sc.close();
	}



	}
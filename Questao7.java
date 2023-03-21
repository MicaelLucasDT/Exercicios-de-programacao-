import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double gasolina = 3.79;
		double  alcool = 2.90;
		
		System.out.println("Qual o combustível? (1 = Gasolina - 2 = Álcool) ");
		double TPcombustivel = sc.nextDouble();
		System.out.println("Quantos litros deseja abastecer? ");
		double quantidade = sc.nextDouble();
		
		if (TPcombustivel == 1){
			
			double valor = (gasolina * quantidade);
			System.out.println("Total a pagar: " + valor);
		}
		
		else if (TPcombustivel == 2) {
			
			double valor2 = (alcool * quantidade);
			System.out.println("Total a pagar: " + valor2);
		}
		
		
		sc.close();
	}

}

import java.util.Scanner;


public class Adiciona5_ou_mult8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		
		double valor = entrada.nextDouble();
		
		if (valor > 20) {
			
			double resultado = valor + 5;
			System.out.print("O valor � maior que 20, portanto resultar� em: " + resultado);
			
		}
		else {
			
			double resultado = valor * 8;
			System.out.print("O valor � menor que 20, portando resultar� em: " + resultado);
			
		}

	}

}

import java.util.Scanner;

public class NumeroMarioOuMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor");
		double valor1 = sc.nextDouble();
		System.out.println("Insira outro valor");
		double valor2 = sc.nextDouble();
		
		if (valor1 > valor2) {
			
			System.out.println( valor1 + " É maior que" + valor2);
			
		}
		
		else {
			
			System.out.println(valor2 + " É maior que " + valor1);
			
		}
		
		sc.close();

	}

}

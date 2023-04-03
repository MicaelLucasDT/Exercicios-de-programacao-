import java.util.Scanner;


public class VerificarMaiorIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		double idade = sc.nextDouble();
		
		if (idade >= 18) {
			
			System.out.println("Você está na maior idade!");
			
		}
		else {
			
			System.out.println("Você é menor de idade!");
			
		}
		
		
		
		
		sc.close();
	}

}

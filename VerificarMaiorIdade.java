import java.util.Scanner;


public class VerificarMaiorIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade: ");
		double idade = sc.nextDouble();
		
		if (idade >= 18) {
			
			System.out.println("Voc� est� na maior idade!");
			
		}
		else {
			
			System.out.println("Voc� � menor de idade!");
			
		}
		
		
		
		
		sc.close();
	}

}

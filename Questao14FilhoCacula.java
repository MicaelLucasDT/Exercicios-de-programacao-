import java.util.Scanner;

public class Questao14FilhoCacula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a idade de Jo�o: ");
		int joao = sc.nextInt();
		System.out.println("Insira a idade de Jos�: ");
		int jose = sc.nextInt();
		System.out.println("Insira a idade de Maria: ");
		int maria = sc.nextInt();

		if (joao < jose) {
			
			if (joao < maria) {
				
				
				System.out.println("Jo�o � o ca�ula. ");
				
			}
			
		}
	
		else if (jose < maria) {
			
			if (jose < joao) {
				
				System.out.println("Jos� � o ca�ula. ");
				
			}
			
		}
		
		else if (maria < jose) {
			
			if(maria < joao) {
				
				System.out.println("Maria � o ca�ula. ");
				
			}
			
			
			
		}
		
		
		
		
		sc.close();
	}

}

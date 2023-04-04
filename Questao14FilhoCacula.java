import java.util.Scanner;

public class Questao14FilhoCacula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a idade de João: ");
		int joao = sc.nextInt();
		System.out.println("Insira a idade de José: ");
		int jose = sc.nextInt();
		System.out.println("Insira a idade de Maria: ");
		int maria = sc.nextInt();

		if (joao < jose) {
			
			if (joao < maria) {
				
				
				System.out.println("João é o caçula. ");
				
			}
			
		}
	
		else if (jose < maria) {
			
			if (jose < joao) {
				
				System.out.println("José é o caçula. ");
				
			}
			
		}
		
		else if (maria < jose) {
			
			if(maria < joao) {
				
				System.out.println("Maria é o caçula. ");
				
			}
			
			
			
		}
		
		
		
		
		sc.close();
	}

}

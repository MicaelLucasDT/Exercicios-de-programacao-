import java.util.Scanner;


public class Questao17_QuiosqueDeSorvete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sabor de sorevete você deseja? (Morango ou Chocolate)");
		String sabor = sc.nextLine();
		
		System.out.println("Quantas bolas de sorvete você deseja?");
		int bolas = sc.nextInt();
		
		if ("Morango".equalsIgnoreCase(sabor)) {
			
			System.out.println("Sem desconto!");
			
		}		
		
		else if("Chocolate".equalsIgnoreCase(sabor)) {
			
			if (bolas >= 3) {
				
				System.out.println("Você possui desconto de 10%!");
				
			}
			else {
				
				System.out.println("Você possiu desconto de 5%");
				
			}
			
		}
		else {
			
			System.out.println("Sabor inválido! ");
			
		}
		
		
		sc.close();
		
	}

}

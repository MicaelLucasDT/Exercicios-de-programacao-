import java.util.Scanner;


public class Questao17_QuiosqueDeSorvete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sabor de sorevete voc� deseja? (Morango ou Chocolate)");
		String sabor = sc.nextLine();
		
		System.out.println("Quantas bolas de sorvete voc� deseja?");
		int bolas = sc.nextInt();
		
		if ("Morango".equalsIgnoreCase(sabor)) {
			
			System.out.println("Sem desconto!");
			
		}		
		
		else if("Chocolate".equalsIgnoreCase(sabor)) {
			
			if (bolas >= 3) {
				
				System.out.println("Voc� possui desconto de 10%!");
				
			}
			else {
				
				System.out.println("Voc� possiu desconto de 5%");
				
			}
			
		}
		else {
			
			System.out.println("Sabor inv�lido! ");
			
		}
		
		
		sc.close();
		
	}

}

import java.util.Scanner;


public class Questao16_IdadeDoEleitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o ano de seu nascimento: ");
		int ano = sc.nextInt();
		
		int idade = 2023 - ano;
		
		if (idade >= 18) {
			
			if(idade <= 70) {
				
				System.out.println("Voc� t�m " + idade + " anos.");
				System.out.println("Voc� � obrigado a votar! ");
				
			}
			
		}
		else {
			
			System.out.println("Voc� t�m " + idade + "anos.");
			System.out.println("Voc� n�o � obrigado a votar");
			
		}	
		
		
		
		
		sc.close();
	}

}

import java.util.Scanner;


public class Questao16_IdadeDoEleitor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o ano de seu nascimento: ");
		int ano = sc.nextInt();
		
		int idade = 2023 - ano;
		
		if (idade >= 18) {
			
			if(idade <= 70) {
				
				System.out.println("Você têm " + idade + " anos.");
				System.out.println("Você é obrigado a votar! ");
				
			}
			
		}
		else {
			
			System.out.println("Você têm " + idade + "anos.");
			System.out.println("Você não é obrigado a votar");
			
		}	
		
		
		
		
		sc.close();
	}

}

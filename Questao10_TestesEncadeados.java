import java.util.Scanner;
import java.text.DecimalFormat;


public class Questao10_TestesEncadeados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("Qual a primeira nota? ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Qual a segunda nota? ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Qual a terceira nota? ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
	
		if (media > 5.1) {

			if (media < 6.9) {

					System.out.println("Sua média foi: " + df.format(media));
					System.out.println("Que pena " + nome + ", você ficou de recuperação.");

			}
			
			else if (media >= 7) {
				
				System.out.println("Sua média foi: " + df.format(media));
				System.out.println("Parabéns, " + nome + " você foi aprovado!");
				
			}		
		
		else {
			
			System.out.println("Sua média foi: " + df.format(media));
			System.out.println("Olá, " + nome + " você foi reprovado! ");
			
		} 	
		
			
		}
		
		sc.close();

	}

}

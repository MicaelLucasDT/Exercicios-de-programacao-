import java.util.Scanner;


public class Verificar_A_Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
				
		System.out.println("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			
			System.out.println("Sua m�dia �: " + media + " Parab�ns " + nome + ", voc� est� aprovado!");
			
		}
		
		else {
			
			System.out.println("Sua m�dia �: " + media +"Parab�ns"  + nome +   ", Que pena, voc� foi reprovado! ");
			
		}
		
		
		
	}

}

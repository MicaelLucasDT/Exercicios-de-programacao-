import java.util.Scanner;

public class VerificarAlistamento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Insira a sua idade: ");
		int idade = entrada.nextInt();
		
		
		if (idade >= 18) {
			System.out.println("Ol� " + nome + "! Voc� est� alistado!");
		} 
		else {
			System.out.println("Ol�, " + nome + "! Voc� n�o tem idade suficiente para realiza��o do alistamento! ");
			}
		
	}
}

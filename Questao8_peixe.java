import java.util.Scanner;

public class Questao8_peixe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a pesagem dos peixes: ");
		double peso = sc.nextDouble();
		
		if(peso > 50) { 
			
			double exceco = peso - 50;
			double multa = (exceco * 4);
			
			System.out.println("Multado!");
			System.out.println("Valor da multa: R$" + multa);
			
		}
		else {
			
			System.out.println("A pesagem está dentro das normas. Boas vendas!");
			
		}
		
		
		
		sc.close();
	}

}

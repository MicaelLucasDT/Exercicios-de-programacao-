import java.util.Scanner;

public class ProgramacaoOrientadaObjeto01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Insira os lados do trinângulo 1------------------------------------");
		System.out.println("Insira o 1° lado do triângulo: ");
		x.a = sc.nextInt();
		
		System.out.println("Insira o 2° lado do triângulo: ");
		x.b = sc.nextInt();
		
		System.out.println("Insira o 3° lado do triângulo: ");
		x.c = sc.nextInt();
		
		System.out.println("Insira os lados do trinângulo 2------------------------------------");
		System.out.println("Insira o 1° lado do 2° triângulo: ");
		y.a = sc.nextInt();
		
		System.out.println("Insira o 2° lado do 2° triângulo: ");
		y.b = sc.nextInt();
		
		System.out.println("Insira o 3° lado do 2° triângulo: ");
		y.c = sc.nextInt();
		
		int P1 =  + lad2 + lad3/2;
		
		double valor = P1 * (P1 - lad1) * (P1 - lad2) * (P1 - lad3);
		double valor2 = P2 * (P2 - lad11) * (P2 - lad22) * (P2 - lad33);
		
		double raiz = Math.sqrt(valor);
		double raiz2 = Math.sqrt(valor2);
		
		System.out.println("A área do primeiro triângulo é: " + raiz);
		System.out.println("A área do primeiro triângulo é: " + raiz2);
		
		if(raiz > raiz2) {
			
			System.out.println("A área do primeiro triangulo é maior!");
			
		}else {
			
			System.out.println("A área do segundo triangulo é maior!");
		}
		
		
		sc.close();
	}

}

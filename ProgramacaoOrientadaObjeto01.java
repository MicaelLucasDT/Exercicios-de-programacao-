import java.util.Scanner;

public class ProgramacaoOrientadaObjeto01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Insira os lados do trin�ngulo 1------------------------------------");
		System.out.println("Insira o 1� lado do tri�ngulo: ");
		x.a = sc.nextInt();
		
		System.out.println("Insira o 2� lado do tri�ngulo: ");
		x.b = sc.nextInt();
		
		System.out.println("Insira o 3� lado do tri�ngulo: ");
		x.c = sc.nextInt();
		
		System.out.println("Insira os lados do trin�ngulo 2------------------------------------");
		System.out.println("Insira o 1� lado do 2� tri�ngulo: ");
		y.a = sc.nextInt();
		
		System.out.println("Insira o 2� lado do 2� tri�ngulo: ");
		y.b = sc.nextInt();
		
		System.out.println("Insira o 3� lado do 2� tri�ngulo: ");
		y.c = sc.nextInt();
		
		int P1 =  + lad2 + lad3/2;
		
		double valor = P1 * (P1 - lad1) * (P1 - lad2) * (P1 - lad3);
		double valor2 = P2 * (P2 - lad11) * (P2 - lad22) * (P2 - lad33);
		
		double raiz = Math.sqrt(valor);
		double raiz2 = Math.sqrt(valor2);
		
		System.out.println("A �rea do primeiro tri�ngulo �: " + raiz);
		System.out.println("A �rea do primeiro tri�ngulo �: " + raiz2);
		
		if(raiz > raiz2) {
			
			System.out.println("A �rea do primeiro triangulo � maior!");
			
		}else {
			
			System.out.println("A �rea do segundo triangulo � maior!");
		}
		
		
		sc.close();
	}

}

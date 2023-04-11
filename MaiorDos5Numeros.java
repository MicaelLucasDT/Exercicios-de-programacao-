import java.util.Scanner;

public class MaiorDos5Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int x1 = sc.nextInt();
		int maior = x1;
		int menor = x1;

		int n = 1;

		while (n <= 4) {

			System.out.println("Informe outro valor: ");
			int x2 = sc.nextInt();

			if (x2 > maior) {
				maior = x2;
			}
			if (x2 < menor) {
				menor = x2;
				
			}
			n++;
		}
		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);
	
		sc.close();
	}

}

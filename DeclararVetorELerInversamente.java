import java.util.Scanner;

public class DeclararVetorELerInversamente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] valor = new int[5];

		for (int i = 0; i <= 4; i++) {

			System.out.println("Insira um valor: ");
			valor[i] = sc.nextInt();

		}
		
		System.out.println("+ -- Vetor origninal -- +");
		for (int i : valor) {

			System.out.println(i);

		}
		System.out.println("+ -- Vetor invertido -- +");
		for(int i = 4; i >= 0; i--) {
			System.out.println(valor[i]);
			
		}

		sc.close();
	}

}

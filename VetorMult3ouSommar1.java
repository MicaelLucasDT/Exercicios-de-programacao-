import java.util.Scanner;

public class VetorMult3ouSommar1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] valor = new int[5];
		int pares, impares;

		for (int i = 0; i <= 4; i++) {

			System.out.println("Insira um valor: ");
			valor[i] = sc.nextInt();

		}

		System.out.println("+ -- Vetor origninal -- +");
		for (int i : valor) {

			System.out.println(i);

		}
		for (int i = 0; i <= 4; i++) {

			if (valor[i] % 2 == 0) {
				valor[i] = valor[i] * 3;
			} else{
				valor[i] = valor[i] + 1;
				}

			}
		System.out.println("+ -- Vetor alterado -- +");
		for(int i : valor) {
			System.out.println(i);
			
		}
	
	sc.close();
	}
}



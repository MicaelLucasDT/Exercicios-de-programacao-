import java.util.Scanner;

public class TesteOperadorTernario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número: ");
		int num = sc.nextInt();

		String resultado = (num % 2 == 0) ? "PAR" : "IMPAR";

		System.out.println(resultado);

		sc.close();

	}

}

import java.util.Scanner;

public class Questao_Ler_Vogal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira uma letra: ");
		String letra = sc.nextLine();

		if ("a".equalsIgnoreCase(letra)) {

			System.out.println("A letra é uma vogal! ");

		}

		else if ("e".equalsIgnoreCase(letra)) {

			System.out.println("A letra é uma vogal! ");

		}

		else if ("i".equalsIgnoreCase(letra)) {

			System.out.println("A letra é uma vogal! ");

		}

		else if ("o".equalsIgnoreCase(letra)) {

			System.out.println("A letra é uma vogal! ");

		}

		else if ("u".equalsIgnoreCase(letra)) {

			System.out.println("A letra é uma vogal! ");

		}

		else {

			System.out.println("A letra é uma conçoante! ");

		}

		sc.close();
	}

}

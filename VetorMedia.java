import java.util.Scanner;

public class VetorMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] nota = new int[4];
		int soma = 0;
		
		for(int i = 0; i <=3; i++) {
			
			System.out.println("Insira a nota: " );
			nota[i] = sc.nextInt();		
			soma = soma + nota[i];
			
		}
		
		double media = soma / 4;
		System.out.println("A média é: " + media);
		

		sc.close();
	}

}

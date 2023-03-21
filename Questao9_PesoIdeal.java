import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao9_PesoIdeal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println("Insira a sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Insira seu sexo: 1-Masculino ou 2-Feminino");
		double sexo = sc.nextDouble();
		
		if (sexo == 1) {
			
			double PesoHomem = (72.7 * altura) - 58;
			System.out.println("O seu peso ideal é: " + df.format(PesoHomem));
		}
		else if(sexo == 2) {
			
			double PesoMulher = (62.1 * altura) - 44.7;
			System.out.println("O seu peso ideal é: " + df.format(PesoMulher));
			
		}
		
		sc.close();
		
	}

}

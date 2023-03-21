import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		double gasolina = 3.79;
		double  alcool = 2.90;
		
		System.out.println("Qual o combustível? (Gasolina ou Alcool) ");
		String TPcombustivel = sc.nextLine();
		System.out.println("Quantos litros deseja abastecer? ");
		double quantidade = sc.nextDouble();
		
		if ("Gasolina".equalsIgnoreCase(TPcombustivel)){	//equals está servindo para comparar o *conteúdo* entre uma String com um objeto. Em geral, equals aponta valor da string com a do objeto.
															//No caso, o termo "IgnoreCase" após o método, está servindo para anular a diferênça entre maiúsculo e minúsculo na resposta do usuário. Java é case sensitive!
			double valor = (gasolina * quantidade);
			System.out.println("Total a pagar: R$" + df.format(valor));
		}
		
		else if ("Alcool".equalsIgnoreCase(TPcombustivel)) {
			
			double valor = (alcool * quantidade);
			System.out.println("Total a pagar: R$" + df.format(valor));
		}
		
		
		sc.close();
	}



	}
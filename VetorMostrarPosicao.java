import java.util.Scanner;

public class VetorMostrarPosicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] num = new int[4];
		
		for(int i = 0; i <=3; i++){
		System.out.println("Insira o n�mero: ");
		num[i] = sc.nextInt();
		}
		
		for(int i = 0; i <=3; i++){			
			System.out.println("Posi��o " + i + " Possui o valor " + num[i]);
		}
		
		
		sc.close();
	}

}

import java.util.Scanner;

public class MultDe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insira um valor: ");
		
		int n1 = sc.nextInt();
	
		if(n1 % 3 == 0) {
			
			System.out.println("O n�mero � m�ltiplo por 3! ");
		}
		
		else {
			
			System.out.println("O n�mero n�o � multiplo por 3");
			
		} 
	
	sc.close();
	
	}

}

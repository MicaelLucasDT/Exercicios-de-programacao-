import java.util.Scanner;

public class CriarUmVetorAigualA_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] A = new int[5];
		int [] B = new int[5];
		
		for(int i = 0; i <=4; i++){
			System.out.println("Insira o número: ");
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		System.out.println("Os valores de A são: A");
		for(int i = 0; i <=4; i++) {
			System.out.println("Posição  "+i+ ": " + A[i]);		
		}
		System.out.println("Os valores de A são: B");
		for(int i = 0; i <=4; i++) {
			System.out.println("Posição "+i+ ": " + B[i]);			
		}
		
		
		
	}

}

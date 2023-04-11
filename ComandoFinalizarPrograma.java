import java.util.Scanner;

public class MultiploDe3ImparAte100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String resp = "SIM";
		
		while (resp.equalsIgnoreCase("SIM") ) {
			System.out.println("Oi");
			
		  System.out.println("Deseja continuar? Sim ou não");
		  resp = sc.nextLine().toUpperCase();
				
			}
			
		System.out.println("Programa finalizado!");	
		
		}
		
	}



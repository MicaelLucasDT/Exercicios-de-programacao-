import java.util.Scanner; 

public class LerSexo_M_ou_F {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 'M' para masculino ou 'F' para feminino: ");
		String sexo = sc.nextLine();
		
		if ("M".equals(sexo) ) {
			
			System.out.println("Você é do sexo masculino!");
			
		}
		
		else if("F".equals(sexo) ) {
			
			System.out.println("Você é do sexo feminino! ");
			
		}
		
		
		
		sc.close();
	}

}

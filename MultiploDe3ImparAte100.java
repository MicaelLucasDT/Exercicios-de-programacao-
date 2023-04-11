
public class MultiploDe3ImparAte100 {

	public static void main(String[] args) {
		
		int x = 1;
		int somaImpar = 0;
		
		while (x <= 100) {
			
			if((x % 3 == 0) && (x % 2 != 0)) {
				
				somaImpar = somaImpar + x;
				
			}
			
			x++;
			
		}
		System.out.println("A soma dos impares é: " + somaImpar);
	}

}

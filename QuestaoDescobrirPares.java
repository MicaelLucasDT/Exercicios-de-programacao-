public class QuestaoDescobrirPares {

	public static void main(String[] args) {
		
		int valor = 1;
		int contadorPar = 0;
		int somapar = 0;
		
		while (valor <= 5) {
			
			if(valor % 2 == 0) {
				
				System.out.println(valor + " � Par!");
				contadorPar = contadorPar + 1;
				somapar = somapar + valor;
				
			}
			
			valor++;
		}
		System.out.println("A quantidade de n�meros pares �: " + contadorPar);
		System.out.println("A soma dos n�meros pares �: " + somapar);
		
		
	}

}

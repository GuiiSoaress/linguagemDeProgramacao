package aula_07;

public class ExemploArray {

	public static void main(String[] args) {
		int i;
		
		int[] resultados = new int[11];
		
		for(i = 0; i <= 10; i++) {
			resultados[i] = i* 7;
		}
		
		for(i = 0; i<= 10; i++) {
			System.out.println(" 7 x "+ i +" \t= " + resultados[i]);
		}
	}

}
	 
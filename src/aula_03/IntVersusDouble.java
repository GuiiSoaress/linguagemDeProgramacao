package aula_03;

public class IntVersusDouble {

	public static void main(String[] args) {
		
		int var;
		double x;
		
		var = 10;
		x = 10.0;
		
		System.out.println("Valor original de var: " + var);
		System.out.println("Valor original de x " + x);
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("Valor após a divisão de var: " + var);
		System.out.println("Valor após a divisão de x: " + x);


	}

}

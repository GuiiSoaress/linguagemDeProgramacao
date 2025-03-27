package aula_09;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		int[] meuArrayInt = new int[5];
		boolean[] meuArrayBool = new boolean[5];
		String[] meuArrayStr = new String[5];
		
		for(int i : meuArrayInt) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		for(boolean i : meuArrayBool) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		for(String i : meuArrayStr) {
			System.out.print(i + "\t");
		}
		
	}

}

package aula_09;

import java.util.Arrays;

public class MetodosArrays {

	public static void main(String[] args) {
		int[] a = {5, 21, 7, 30, 40, 25, 18, 77, 51, 17};
		int[] b = new int[10];
		
		System.out.println("Tamanho do vetor a: "+ a.length);
		System.out.println("Tamanho do vetor b: " + b.length);
		
		for(int i : b) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		b = a.clone();
		
		for(int i : b) {
			System.out.print(i + "\t");
		
		}
		
		System.out.println();
		Arrays.sort(a);
		
		for(int i : a) {
			System.out.print(i + "\t");
		
		}
	}

}

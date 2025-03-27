package aula_08;

import java.util.Scanner;

public class BublleSort {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[11];
    
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: "); 
            numeros[i] = scan.nextInt();
        }
        
        System.out.println("Você digitou os números:");
        for (int i = 0;i < 9; i++) {
            System.out.print("| "+ numeros[i]+ " ");
        }
        
        for(int n = 0; n < 9; n++) {
        for(int i = 0; i < 9; i++) {
        	if (numeros[i] > numeros[i+1]) {
        		
        		int aux = numeros[i];
        		numeros[i] = numeros[i+1];
        		numeros[i+1] = aux;
        	}else {
        		continue;
        	}
        }

        }
        System.out.println();
        System.out.println("Os números ordenados são: ");
        for (int i = 0;i < 9; i++) {
            System.out.print("| "+ numeros[i]+ " ");
        }
        
        scan.close();
	}

}

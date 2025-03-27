package aula_08;

import java.util.Scanner;

public class DesafioBusca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		

		
		for(int i = 0; i < 10; i++) {
			numeros[i] = (int) (Math.random() * 100) + 1;
		}
		
        System.out.println("Vetor");
        for (int i = 0;i < 10; i++) {
            System.out.print("| "+ numeros[i]+ " ");
        }
        System.out.println();
        
		
		System.out.println("Digite o numero que deseja buscar: ");
		int busca = scan.nextInt();
		
		

        
        for (int i = 0; i < 10; i++) {
        	
        	if (numeros[i] == busca) {
        		System.out.println("O numero "+ busca +" foi ENCONTRADO na posição "+ (i+ 1) +" do vetor;");
        		break;
        	}
        	
        	if(i == 9) {
        		System.out.println("O numero "+ busca +" NÂO FOI ENCONTRADO no vetor");
        	}
        }
     
        
       
	}

}

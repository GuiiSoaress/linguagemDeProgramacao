package aula_09;

import java.util.Scanner;

public class DesafioBuscaBinaria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[101];
		
		//Gera 100 numeros aleatorios e os armazena no Vetor
		for(int i = 0; i < 100; i++) {
			vetor[i] = (int) (Math.random() * 1000);
		}
		
		//printa O vetor
        for (int i = 0; i <= 99; i++) {
            System.out.println("| "+ vetor[i]+ " | " + i);
        }
        System.out.println();
	
        //BublleSort para Ordenar o vetor
        for(int n = 0; n < 100; n++) {
        for(int i = 0; i < 100; i++) {
        	if (vetor[i] > vetor[i+1]) {
        		
        		int aux = vetor[i];
        		vetor[i] = vetor[i+1];
        		vetor[i+1] = aux;
        	}else {
        		continue;
        	}
        }

        }
        
       //Printa o vetor Ordenado
        System.out.println("Ordenados : ");
        for (int i = 0;i < 100; i++) {
            System.out.println("| "+ vetor[i]+ " | " + i);
            
        }
         System.out.println();
         
        //Coleta o numero Alvo da Busca
		System.out.println("Digite o Alvo: ");
		int alvo = scan.nextInt();
		
		scan.close();
		
		//Define esquerda, meio e direita de acordo com o vetor. posição min, meio e  posição max
		int esquerda = 0;
		int direita = vetor.length;
		int meio = (direita + esquerda) /2;
		
		//For que executa a busca 
		for(int i = 0; i < 100; i++) {
			
			//Se o valor do vetor(meio) for igual ao alvo, Numero encontrado
			if (vetor[meio] == alvo) {
				System.out.println("Encontrado na posição " + meio + " = "+ vetor[meio] );
				break;
			}else if (direita <= esquerda) { // Verifica se o vetor ja foi completamente varrido
				System.out.println("Não Encontrado");
				break;
				
			}else if (vetor[meio] > alvo) { // se o meio For maior que o alvo, define a direita como meio e "Deleta" o que estiver a direita do meio
				
				direita = meio - 1;
				meio = (direita + esquerda) /2;
				
			}else if (vetor[meio] < alvo) {// se o meio For maior que o avlo, define a esquerda como meio e "Deleta" o que estiver a direita do meio
				
				esquerda = meio + 1;
				meio = (direita + esquerda) /2;
				
			}else {
				continue;
			}	
		}	
	}

}

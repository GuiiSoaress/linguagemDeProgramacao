package aula_11;

import java.util.Scanner;

public class ConversorGrandezas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu = 1;
		
		while(menu == 1) {
			
			try {
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("--------------------------------Conversor de Grandezas ----------------------------------------");
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("Escolha a grandeza que deseja converter e digite seu valor correspondente: ");
				System.out.println("1 - Distância");
				System.out.println("2 - Massa");
				System.out.println("3 - Temperatura");
				System.out.println("4 - Área");
				int grandeza = scan.nextInt();
			}
			catch(Exception Error) {
				System.out.println("Erro: " + Error);
				System.out.println("Reiniciando o Programa");
				
			}
			
		}

	}

}

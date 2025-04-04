package aula_11;

import java.util.Scanner;

public class TratamentoDeExececoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Digite um  numero: ");
			int numerador = scan.nextInt();
			
			System.out.println("Digite outro numero: ");
		} 
		catch(Exception e){
			System.out.println("Erro : " + e);
			
		}
		finally {
			System.out.println("Até logo!");
			scan.close();
		}
		
	
	}

}

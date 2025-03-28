package aula_10;

import java.util.Scanner;

public class MetodoComRetorno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua massa em Kg: ");
		double massa = scan.nextDouble();
		
		System.out.println("Digite sua altura em m: ");
		double altura = scan.nextDouble();
		
		double imc = calculaImc(massa, altura);
		System.out.println("Seu IMC = "+ imc);
	}

	public static double calculaImc(double massa, double altura) {
		return massa / (Math.pow(altura, 2));
	}
	
}

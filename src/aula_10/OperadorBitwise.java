package aula_10;

import java.util.Scanner;

public class OperadorBitwise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro entre 0 e 65535: ");
		int num = scan.nextInt();
		
		int mascara = 32768;
				
		for(int i = 1; i <= 16; i++) {
			
			if((num & mascara) == 0) {
				System.out.print("0");
			}else {
				System.out.print("1");
			}
			
			if ((i % 4) == 0) {
				System.out.print(" ");
			}
			
			mascara = mascara / 2;
			
		}

	}

}

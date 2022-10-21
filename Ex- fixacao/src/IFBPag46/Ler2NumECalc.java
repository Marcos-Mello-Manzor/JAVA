/* 1. Escreva um algoritmo que leia dois números, calcule o produto entre eles, mostre
		o resultado e os números recebidos. */

package IFBPag46;

import java.util.Scanner;

public class Ler2NumECalc {
	public static void main(String[] args) {
		
		
		Scanner entre = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = entre.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = entre.nextInt();
		
		int prod = numero1 * numero2;
		
		System.out.println("O produto é igual a: " + prod);
		
		entre.close();
	}

}

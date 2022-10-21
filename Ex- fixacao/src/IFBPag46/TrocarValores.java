/*4- Leia dois valores para as variáveis A e B, efetue a troca dos valores de forma
que a variável A passe a ter o valor da variável B e que a variável B, o valor da
variável A. Apresentar os valores trocados.*/

package IFBPag46;

import java.util.Scanner;

public class TrocarValores {
	
	public static void main(String[] args) {
		
		Scanner entre = new Scanner(System.in);
		
			System.out.println("Digite um valor para A: ");
			int A = entre.nextInt();
			
			System.out.println("Digite um valor para B: ");
			int B = entre.nextInt();
			
			int C;
			
			C = A;
			A = B;
			B = C;
			
			System.out.println("A = " + A);
			System.out.println("B = " + B);		
		
		entre.close();
	}
	

}

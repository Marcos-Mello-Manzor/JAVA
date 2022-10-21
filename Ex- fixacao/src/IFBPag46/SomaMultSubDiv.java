/*3. Faça um algoritmo que receba dois números, calcule a divisão, a multiplicação,
a soma, a diferença entre eles e mostre os resultados.*/

package IFBPag46;

import java.util.Scanner;

public class SomaMultSubDiv {
	public static void main(String[] args) {
		
		Scanner entre = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			int n1 = entre.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int n2 = entre.nextInt();
			
			int soma = n1 + n2;
			int multi = n1 * n2;
			int sub = n1 - n2;
			int div = n1 / n2;
			
			System.out.println("SOMA = " + soma);
			System.out.println("MULTIPLICACAO = " + multi);
			System.out.println("SUBTRACAO = " + sub);
			System.out.println("DIVISAO = " + div);
			
		entre.close();
	}
}

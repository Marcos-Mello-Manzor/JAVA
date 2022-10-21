/*5. Faça um algoritmo que leia uma temperatura fornecida em graus Fahrenheit e
a converta para o seu equivalente em graus centígrados.*/

package IFBPag46;

import java.util.Scanner;

public class FarenhitToCelcius {
	
	public static void main(String[] args) {
		
		Scanner entre = new Scanner(System.in);
		
			System.out.println("Digite a temperatura em graus Farenheit: ");
			int f = entre.nextInt();
			
			int c = (f - 32) * 5/9;
			
			System.out.println("Farenheit: " + f);
			System.out.println("Celcius: " + c);
		
		entre.close();
	}

}

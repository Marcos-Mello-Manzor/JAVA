/*2. Crie um algoritmo que receba a idade de três pessoas, calcule e mostre a média
das idades.*/

package IFBPag46;

import java.util.Scanner;

public class MediaIdades {
	public static void main(String[] args) {
		
		Scanner entre = new Scanner (System.in);
		
		System.out.println("Digite a primeira idade:");
		int idade1 = entre.nextInt();
		
		System.out.println("Digite a segunda idade:");
		int idade2 = entre.nextInt();
		
		System.out.println("Digite a terceira idade:");
		int idade3 = entre.nextInt();
		
		int media = (idade1 + idade2 + idade3) / 3;
		
		System.out.println("Media das idades: " + media + " anos");
		
		entre.close();
		
	}

}

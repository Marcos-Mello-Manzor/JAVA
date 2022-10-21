/*7. Faça um algoritmo que receba a matrícula e as três notas do aluno, calcule a
sua média, sabendo que a primeira nota tem peso dois, a segunda peso três e
a terceira peso quatro. Mostre a matrícula e a média do aluno.*/

package IFBPag46;

import java.util.Scanner;

public class NotasAluno {
	public static void main(String[] args) {
		
		Scanner entre = new Scanner(System.in);
		
			System.out.println("Digite a Matricula do aluno: ");
			int matricula = entre.nextInt();
			
			System.out.println("Digite a nota 1 (peso 2): ");
			int nota1 = entre.nextInt();
			
			System.out.println("Digite a nota 2 (peso 3): ");
			int nota2 = entre.nextInt();
			
			System.out.println("Digite a nota 3 (peso 4): ");
			int nota3 = entre.nextInt();
			
			//int peso = 2 + 3 + 4;
		
			int media = (nota1 * 2) + (nota2 * 3) + (nota3 * 4) / (2 + 3 + 4);
			
			System.out.println("Matricula: " + matricula);
			System.out.println("Media do aluno: " + media);
			
		entre.close();
	}

}

/*6. Uma empresa de energia elétrica calcula o valor da conta de luz de acordo com o
consumo em Kw/h. Faça um algoritmo que receba o número da conta, a leitura
anterior e a leitura atual, calcule o valor a ser pago, sabendo que a tarifa do
Kw/h é de 0.20725. Mostre o número da conta, o valor da conta e o consumo
de luz de um usuário*/

package IFBPag46;

import java.util.Scanner;

public class ConsumoEmKwH {
	public static void main(String[] args) {
		
		Scanner entre = new Scanner(System.in);
		
			System.out.println("Digite o Nro da sua conta de energía: ");
			int conta = entre.nextInt();
			
			System.out.println("Digite a leitura anterior em kw/h: ");
			int anterior_leitura = entre.nextInt();
		
			System.out.println("Digite a leitura atual em Kw/h: ");
			double atual_leitura = entre.nextDouble();
			
			double tarifa = 0.20725;
			
			double valor = (atual_leitura - anterior_leitura) * tarifa;
				
			
			System.out.println("Conta Nro.: " + conta);
			System.out.println("Leitura anterior: " + anterior_leitura + "Kw/h");
			System.out.println("Leitura atual: " + atual_leitura + "Kw/h");
			System.out.println("Consumo total: R$" + valor);
		
		entre.close();
	}
}

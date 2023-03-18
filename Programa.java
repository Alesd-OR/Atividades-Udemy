/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
exemplo). 
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
mostrando os dados da conta após cada operação.  */

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner oli = new Scanner(System.in);
		conta conta;

		System.out.print("Insira o número da conta: ");
		int numero = oli.nextInt();
		System.out.print("Insira o titular da conta: ");
		oli.nextLine();
		String titular = oli.nextLine();
		System.out.print("Há algum depósito inicial? S/N ");
		char resposta = oli.next().charAt(0);
		if (resposta == 'S') {
			System.out.print("Digite o valor inicial: ");
			double depositoInicial = oli.nextDouble();
			conta = new conta(numero, titular, depositoInicial);
		} else {
			conta = new conta(numero, titular);
		}

		System.out.println();
		System.out.println("Informações da conta:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = oli.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = oli.nextDouble();
		conta.deposito(valorSaque);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);

		oli.close();
	}
}

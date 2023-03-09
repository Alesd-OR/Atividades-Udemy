//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
//exemplo

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner caixa = new Scanner(System.in);

        int codigo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Olá, poderia me informar o código da sua compra? ");
        codigo = caixa.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                System.out.println("Você escolheu álcool!");
                alcool += 1;
            } else if (codigo == 2) {
                System.out.println("Você escolheu gasolina!");
                gasolina += 1;
            } else if (codigo == 3) {
                System.out.println("Você escolheu diesel!");
                diesel += 1;
            }

            codigo = caixa.nextInt();
        }

        System.out.println("Obrigado pela compra!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        caixa.close();
    }
}
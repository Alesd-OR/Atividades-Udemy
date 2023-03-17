/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver.  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {
    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // solicita ao usuário a quantidade de pessoas a serem cadastradas
        System.out.println("Quantas pessoas serão digitadas?");
        int qtdPessoas = oli.nextInt();

        // cria arrays para armazenar nome, idade e altura das pessoas
        String[] dPessoas = new String[qtdPessoas];
        double[] dAltura = new double[qtdPessoas];
        int[] dIdade = new int[qtdPessoas];

        // variável para armazenar a soma das alturas
        double soma = 0;

        // loop para obter informações de cada pessoa
        for (int i = 0; i < dPessoas.length; i++) {
            System.out.println("\nDados da " + (i + 1) + " pessoa");
            System.out.println("\nNome: ");
            dPessoas[i] = oli.next();

            System.out.println("\nIdade: ");
            dIdade[i] = oli.nextInt();

            System.out.println("\nAltura: ");
            dAltura[i] = oli.nextDouble();

            // adiciona a altura ao total para posterior cálculo da média
            soma += dAltura[i];
        }

        double media = soma / dAltura.length;

        System.out.printf("ALTURA MÉDIA: %.2f\n", +media);

        // variável para armazenar a quantidade de pessoas com idade menor que 16 anos
        int countMenor16 = 0;

        // array para armazenar o nome das pessoas com idade menor que 16 anos
        String[] nomesMenor16 = new String[qtdPessoas];

        // loop para percorrer o array de idades e contar quantas pessoas têm menos de
        // 16 anos e armazenar os nomes delas
        for (int i = 0; i < dIdade.length; i++) {
            if (dIdade[i] < 16) {
                nomesMenor16[countMenor16] = dPessoas[i];
                countMenor16++;
            }
        }

        // verifica se existem pessoas com menos de 16 anos cadastradas
        if (countMenor16 > 0) {
            // calcula a porcentagem de pessoas com menos de 16 anos
            double porcentoMenor16 = (double) countMenor16 / qtdPessoas * 100;
            // imprime a porcentagem formatada com duas casas decimais
            System.out.printf("%.2f%% das pessoas têm menos de 16 anos. \n", porcentoMenor16);
            // imprime os nomes das pessoas com menos de 16 anos
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (int i = 0; i < countMenor16; i++) {
                System.out.println(nomesMenor16[i]);
            }
        } else {
            System.out.println("Não há pessoas com menos de 16 anos.");
        }

        oli.close();
    }
}
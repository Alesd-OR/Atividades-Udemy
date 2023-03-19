/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaeMediaVetor {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;

        System.out.println("Digite a quantidade de números que você quer saber a média: ");
        int quantidade = oli.nextInt();

        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = oli.nextInt();
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("VALORES: " + vetor[i]);
        }
        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + media);

        oli.close();
    }
}

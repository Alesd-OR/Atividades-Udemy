/*Fazer um programa para ler um vetor de N números inteiros. 
Em seguida, mostrar na tela a média 
aritmética somente dos números pares lidos, 
com uma casa decimal. Se nenhum número par for 
digitado, mostrar a mensagem "NENHUM NUMERO PAR"  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPares {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade de números que você quer saber a média: ");
        int quantidade = oli.nextInt();

        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = oli.nextInt();
        }

        int[] numPares = new int[vetor.length];

        int soma = 0;
        int contPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                numPares[contPares] = vetor[i];
                soma += numPares[contPares];
                contPares++;
            }
        }

        double media = (double) soma / numPares.length;

        if (contPares == 0) {
            System.out.println("NENHUM PAR");
        } else {
            System.out.println("MEDIA DOS PARES: " + media);
        }

        oli.close();
    }
}
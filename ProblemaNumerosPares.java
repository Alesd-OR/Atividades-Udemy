/*Faça um programa que leia N números inteiros e 
armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e 
também a quantidade de números pares.  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNumerosPares {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você vai digitar?");// Entrada de dados
        int nums = oli.nextInt();

        int[] numeros = new int[nums];// vetor para armazenar o tamanho dos dados

        for (int i = 0; i < numeros.length; i++) {// percorre a quantidade até atingir o tamanho que o usuário solicitou
            System.out.println("Digite o " + (i + 1) + " ° número: ");
            numeros[i] = oli.nextInt();
        }

        // vetores para calcular e separar os numeros pares e impares
        int[] numerosPares = new int[nums];
        int[] numerosImpares = new int[nums];
        int contPares = 0;
        int contImpares = 0;

        // Inicia um laço para percorrer cada elemento do vetor "numeros"
        for (int j = 0; j < numeros.length; j++) {
            // Verifica se o elemento do vetor é par
            if (numeros[j] % 2 == 0) {
                // Se for par, adiciona o número no vetor "numerosPares" na posição "contPares"
                // e incrementa o contador de números pares
                numerosPares[contPares] = numeros[j];
                contPares++;
            }
        }

        System.out.println("Números pares:");
        for (int k = 0; k < contPares; k++) {
            System.out.print(numerosPares[k] + " ");
        }
        System.out.println();

        System.out.println("QUANTIDADE DE PARES: " + contPares);

        oli.close();
    }
}
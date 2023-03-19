/*Fazer um programa para ler um conjunto de nomes de 
pessoas e suas respectivas idades. Os nomes 
devem ser armazenados em um vetor, e as idades em um 
outro vetor. Depois, mostrar na tela o nome 
da pessoa mais velha. */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaisVelho {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas você vai digitar?: ");
        int quantidade = oli.nextInt();

        int[] vetor = new int[quantidade];
        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i + 1) + " ° pessoa");
            System.out.println("Nome: ");
            nomes[i] = oli.next();

            System.out.println("Idade: ");
            idades[i] = oli.nextInt();
        }

        int maiorIdade = idades[0];
        int maiorPosicao = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                maiorPosicao = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[maiorPosicao]);

        oli.close();
    }
}
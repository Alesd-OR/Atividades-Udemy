/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver.  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAltura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner oli = new Scanner(System.in);

        int n, nmenores;
        double alturatotal, alturamedia, percentualMenores;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = oli.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = oli.next();
            System.out.print("Idade: ");
            idades[i] = oli.nextInt();
            System.out.print("Altura: ");
            alturas[i] = oli.nextDouble();
        }

        nmenores = 0;
        alturatotal = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            alturatotal = alturatotal + alturas[i];
        }

        alturamedia = alturatotal / n;
        percentualMenores = ((double) nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        oli.close();
    }
}

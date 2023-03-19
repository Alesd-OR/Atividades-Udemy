/*Fazer um programa para ler um número inteiro N e 
depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos 
com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com 
uma casa decimal cada.  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAbaixodaMedia {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;

        System.out.println("Quantos valores vai ter o vetor?");// Entrada de dados
        int nums = oli.nextInt();

        double[] numreais = new double[nums];// vetor para armazenar o tamanho dos dados

        for (int i = 0; i < nums; i++) {// percorre a quantidade até atingir o tamanho que o usuário solicitou
            System.out.println("Digite o " + (i + 1) + "° número do vetor: ");
            numreais[i] = oli.nextDouble();
            soma += numreais[i];
        }

        double media = soma / numreais.length;

        System.out.printf("MEDIA DO VETOR = %.2f\n ", +media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < numreais.length; i++) {
            if (numreais[i] < media) {
                System.out.printf("%.1f%n", numreais[i]);
            }
        }
        oli.close();
    }
}
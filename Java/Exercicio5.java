//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
//peso 5.

import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner fim = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double notas = fim.nextDouble();

        for (int i = 0; i < notas; i++) {

            double a = fim.nextDouble();
            double b = fim.nextDouble();
            double c = fim.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n ", media);
        }
        fim.close();
    }
}

/*Faça um programa que peça quantidade de numeros e depois seus valores, depois some eles e imprima na tela */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner fore = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros e em seguida seus valores: ");
        int n = fore.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            int x = fore.nextInt();
            soma += x;
        }
        System.out.println(soma);
        fore.close();
    }
}
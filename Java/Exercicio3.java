//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
//X, se for o caso.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para determinar os impares até ele: ");
        int n = leitor.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        leitor.close();
    }
}
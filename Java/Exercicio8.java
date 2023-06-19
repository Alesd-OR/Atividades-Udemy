//Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner divisores = new Scanner(System.in);

        System.out.println("Informe um numero e descubra seus divisores: ");
        int num = divisores.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);

            }
        }

        divisores.close();
    }
}
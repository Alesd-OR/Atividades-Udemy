//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner fatorial = new Scanner(System.in);

        System.out.println("Informe os numeros a serem fatorados: ");
        int num = fatorial.nextInt();

        int fato = 1;

        for (int i = 1; i <= num; i++) {
            fato *= i;
        }
        System.out.println(fato);

        fatorial.close();
    }
}
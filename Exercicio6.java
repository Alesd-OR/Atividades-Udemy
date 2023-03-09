//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner divisivo = new Scanner(System.in);

        System.out.println("Informe a quantidade de divisões: ");
        int divs = divisivo.nextInt();

        for (int i = 0; i < divs; i++) {

            int d = divisivo.nextInt();
            int d2 = divisivo.nextInt();

            if (d2 == 0) {
                System.out.println("divisão impossivel");
            } else {
                double div = d / d2;
                System.out.printf("%.1f%n\n", div);
            }
        }
        divisivo.close();
    }
}
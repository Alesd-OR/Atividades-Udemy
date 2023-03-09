//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int min = 0;
        int max = 0;

        System.out.println("Digite um numero: ");
        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            int teste = leitor.nextInt();
            if (teste >= 10 && teste <= 20) {
                min += 1;
            } else {
                max += 1;
            }
        }

        System.out.println(min + " in");
        System.out.println(max + " out");
        System.out.println("INTERVALO: [10, 20]");

        leitor.close();
    }
}

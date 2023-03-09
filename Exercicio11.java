//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner adoleta = new Scanner(System.in);

        System.out.println("Por favor, digite sua senha: ");
        int senha = adoleta.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = adoleta.nextInt();
        }

        System.out.println("Acesso Permitido");

        adoleta.close();
    }
}
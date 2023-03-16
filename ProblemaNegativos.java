/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner oli = new Scanner(System.in);

        System.out.println("How many numbers are you going to digite?");
        int quant = oli.nextInt();

        if (quant <= 0 || quant > 10) {// semelhante ao sensor de numeros negativos, aqui ele analisa o numero do
                                       // usuario e verifica se e positivo ou maior que 10
            System.out.println("Quantity should be a positive integer less than or equal to 10!");// encerramento do
                                                                                                  // programa em caso de
                                                                                                  // numero maior que 10
            oli.close();
            return;// ele retorna o numero caso nao tenha divergencias
        }
        int[] vect = new int[quant];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = oli.nextInt();
        }

        System.out.println("Negative numbers:");

        for (int i = 0; i < vect.length; i++) {// comando que percorre todos os numeros na quantidade do vetor
            if (vect[i] < 0) { // comando verificador se o numero é negativo ou nao
                System.out.println(vect[i]);// impressao dos numeros negativos
            }

            oli.close();
        }
    }
}
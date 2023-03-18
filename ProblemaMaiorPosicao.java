import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaiorPosicao {
    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int posicaoMaior;
        double maior;

        System.out.println("Quantos números você vai digitar?");// Entrada de dados
        int nums = oli.nextInt();

        double[] numeros = new double[nums];// vetor para armazenar o tamanho dos dados

        for (int i = 0; i < numeros.length; i++) {// percorre a quantidade até atingir o tamanho que o usuário solicitou
            System.out.println("Digite o " + (i + 1) + " ° número: ");
            numeros[i] = oli.nextDouble();
        }

        maior = numeros[0];
        posicaoMaior = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR: %d\n", posicaoMaior);

        oli.close();
    }
}
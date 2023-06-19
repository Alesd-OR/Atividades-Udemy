import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetores {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos valores vai ter cada vetor?");// Entrada de dados
        int nums = oli.nextInt();

        int[] a = new int[nums];// vetor para armazenar o tamanho dos dados
        int[] b = new int[nums];
        int[] c = new int[nums];

        for (int i = 0; i < nums; i++) {// percorre a quantidade até atingir o tamanho que o usuário solicitou
            System.out.println("Digite o " + (i + 1) + "° número do vetor A: ");
            a[i] = oli.nextInt();
        }

        for (int i = 0; i < nums; i++) {
            System.out.println("Digite o " + (i + 1) + "° número do vetor B: ");
            b[i] = oli.nextInt();
        }

        for (int i = 0; i < nums; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i < nums; i++) {
            System.out.printf("%d\n", c[i]);
        }

        oli.close();
    }
}
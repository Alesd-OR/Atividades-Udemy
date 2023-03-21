import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos quartos serão alugados?");// Entrada de dados
        int qtdquartos = oli.nextInt();

        int[] quartos = new int[qtdquartos];// vetor para armazenar o tamanho dos dados
        String[] nomes = new String[qtdquartos];
        String[] emails = new String[qtdquartos];

        for (int i = 0; i < qtdquartos; i++) {
            System.out.println("Aluguel #" + (i + 1));
            System.out.println("Digite seu nome: ");
            nomes[i] = oli.next();
            System.out.println("Digite seu email: ");
            emails[i] = oli.next();
            System.out.println("Digite o número do quarto: ");
            quartos[i] = oli.nextInt();

        }

        System.out.println();

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < qtdquartos; i++) {
            System.out.println(quartos[i] + ": " + nomes[i] + ", " + emails[i]);
        }
        oli.close();
    }
}

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        String a;
        int b;
        double c;

        a = in.next();
        b = in.nextInt();
        c = in.nextDouble();

        System.out.println("Você buscou os seguintes dados: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

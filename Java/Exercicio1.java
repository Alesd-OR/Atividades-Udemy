import java.util.Locale;

public class Exercicio1 {

        public static void main(String[] args) {

                String productOne = "Notebook Acer Aspire 5";
                String productTwo = "Office desk for job";

                int age = 30;
                int code = 5290;
                char gender = 'F';

                double price1 = 2100.0;
                double price2 = 650.50;
                double measure = 53.234567;

                System.out.printf("Products: \n"
                                + "%s, which price is $2100,0 \n"
                                + "%s, which price is $650,50 \n", productOne, productTwo);

                System.out.printf("\nRecord: %d years old, "
                                + "code %d and gender: %s \n", age, code, gender);
                System.out.printf("\nMeasue with eight decimal places: %f \n"
                                + "Rouded (three decimal places): %.2f \n", measure, measure);
                Locale.setDefault(Locale.US);
                System.out.printf("US decimal point: %.2f", measure);

        }
}

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {

    public static void main(String[] args) {

        // Crie um objeto DateTimeFormatter para formatar a data-hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Obtenha a data-hora atual
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        // Obtenha uma data-hora a partir de uma String
        LocalDate d04 = LocalDate.parse("2023-03-28");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-28T23:18:30");
        Instant d06 = Instant.parse("2023-03-28T23:18:30Z");
        Instant d07 = Instant.parse("2023-03-28T23:18:30-03:00");

        // Obtenha uma data-hora a partir de uma String utilizando um DateTimeFormatter
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("28/03/2023 23:30", fmt2);

        // Crie uma data-hora a partir de valores numéricos
        LocalDate d10 = LocalDate.of(2023, 03, 28);
        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 1, 30);

        /*
         * o "to string" é usado também para gerar o seu codigo automaticamente
         * seguindo a norma padrão ISO
         */
        // Imprima as datas-horas utilizando o método toString()
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());

        // A classe LocalDateTime representa uma data-hora, com dia, mês, ano, hora,
        // minuto e segundo
        // A classe LocalDate representa uma data, com dia, mês e ano
        // A classe Instant representa um instante no tempo, com a contagem de segundos
        // desde o Unix Epoch
        // O DateTimeFormatter é uma classe que permite formatar datas-horas em
        // diferentes padrões
        // O método now() é usado para obter a data-hora atual
        // O método parse() é usado para criar uma data-hora a partir de uma String,
        // utilizando um padrão específico
        // O método of() é usado para criar uma data-hora a partir de valores numéricos
        // O método toString() é usado para imprimir uma data-hora em formato String

    }
}

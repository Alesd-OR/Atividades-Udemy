import java.util.Scanner;

public class diferençaDeHoras {
    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);

        System.out.println("Write the inicial time: ");
        int inicialTime = oli.nextInt();
        System.out.println("write the final time: ");
        int finalTime = oli.nextInt();

        int time;
        if (inicialTime < finalTime) {
            time = finalTime - inicialTime;
        } else {
            time = 24 - inicialTime + finalTime;
        }

        System.out.println("The game had " + time + " hours");
        oli.close();
    }

}
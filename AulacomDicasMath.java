public class AulacomDicasMath {

    // dicas e truques de cálculos matemáticos

    public static void main(String[] args) {

        double a = 3.0;
        double b = 4.0;
        double c = -5.0;
        double D, E, F;

        // raiz quadrada
        D = Math.sqrt(a);
        E = Math.sqrt(b);
        F = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + a + " = " + D);
        System.out.println("Raiz quadrada de " + b + " = " + E);
        System.out.println("Raiz quadrada de 25 = " + F);

        // valor elevado
        D = Math.pow(a, b);
        E = Math.pow(a, 2.0);
        F = Math.pow(5.0, 2.0);

        System.out.println(a + " elevado a " + b + " = " + D);
        System.out.println(a + " elevado ao quadrado = " + E);
        System.out.println("5 elevado ao quadrado = " + F);

        // valor absoluto
        D = Math.abs(b);
        E = Math.abs(c);

        System.out.println("Valor absoluto de " + b + " = " + D);
        System.out.println("Valor absoluto de " + c + " = " + E);

    }
}
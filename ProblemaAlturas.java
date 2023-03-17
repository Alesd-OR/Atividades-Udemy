/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver.  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {
    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        

        System.out.println("Quantas pessoas serão digitadas?");
        int qtdPessoas = oli.nextInt();
        String[] dPessoas = new String[qtdPessoas];
        double[] dAltura = new double[qtdPessoas];
        int[] dIdade = new int[qtdPessoas];
        double soma = 0;
        double porcentagemTotal = 100;
        double pMenosde;

        for(int i = 0; i < dPessoas.length; i++){
        System.out.println("\nDados da " + (i+1) + " pessoa");
        System.out.println("\nNome: ");
        dPessoas[i] = oli.next();

        System.out.println("\nIdade: ");
        dIdade[i] = oli.nextInt();

        System.out.println("\nAltura: ");
        dAltura[i] = oli.nextDouble();
        soma += dAltura[i];
    }
    
        double media = soma / dAltura.length;

        System.out.printf("ALTURA MÉDIA: %.2f", + media);

        double porcentagem = (dIdade.length * pMenosde) / porcentagemTotal;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem);

    oli.close();
    }
    
}

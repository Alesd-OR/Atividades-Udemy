/*Fazer um programa para ler um conjunto de N nomes de alunos, 
bem como as notas que eles tiraram 
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada 
em um vetor. Depois, imprimir 
os nomes dos alunos aprovados, considerando aprovados aqueles cuja 
média das notas seja maior ou 
igual a 6.0 (seis).  */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAprovados {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;

        System.out.println("Quantos alunos você vai digitar?");// Entrada de dados
        int nums = oli.nextInt();

        int[] notas = new int[nums];// vetor para armazenar o tamanho dos dados
        String[] nomes = new String[nums];
        int[] posicaoAprovados = new int[nums];
        int contAprovados = 0;

        for (int i = 0; i < notas.length; i++) {// percorre a quantidade até atingir o tamanho que o usuário solicitou
            System.out.println("Digite o " + (i + 1) + "° nome: ");
            nomes[i] = oli.next();

            System.out.println("Digite a 1° nota do aluno: ");
            notas[i] = oli.nextInt();
            System.out.println("Digite a 2° nota do aluno: ");
            notas[i] = oli.nextInt();
            soma += notas[i];

            if (notas[i] >= 6) {
                posicaoAprovados[contAprovados] = i;
                contAprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < contAprovados; i++) {
            System.out.printf("%s\n ", nomes[posicaoAprovados[i]]);
        }
        oli.close();
    }
}
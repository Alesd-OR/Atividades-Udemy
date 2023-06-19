/*Crie um vetor com 100 números inteiros gerados aleatoriamente (utilizando a classe Random)
Solicite ao usuário que digite um número
Utilizando o método de busca binária, verifique se o número consta no vetor
Caso o número esteja repetido no vetor retornar o primeiro encontrado
Imprimir a quantidade de vezes/passos que o algoritmo precisou repetir/comparar para encontrar o número (encontrando ou não )
Apresentar uma mensagem indicando em qual posição o elemento foi encontrado (caso exista no vetor) ou uma mensagem que o elemento não existe
Veja que existe uma particularidade na busca binária quanto ao vetor. Este passo não está listado aqui mas é condição obrigatória para busca binária. */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] vetor = gerarVetorAleatorio(100);
        Arrays.sort(vetor); // ordena o vetor para utilizar a busca binária

        Scanner oli = new Scanner(System.in);
        System.out.print("Digite um número para buscar no vetor: ");
        int numero = oli.nextInt();

        int posicao = buscaBinaria(vetor, numero);

        if (posicao >= 0) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O número " + numero + " não foi encontrado no vetor.");
        }
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(1000);
        }
        return vetor;
    }

    public static int buscaBinaria(int[] vetor, int numero) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int passos = 0;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == numero) {
                passos++;
                while (meio > 0 && vetor[meio - 1] == numero) { // verifica se o número está repetido no vetor
                    meio--;
                    passos++;
                }
                return meio;
            } else if (vetor[meio] < numero) {
                passos++;
                inicio = meio + 1;
            } else {
                passos++;
                fim = meio - 1;
            }
        }

        System.out.println("A busca binária precisou comparar " + passos + " elementos do vetor.");
        return -1;
    }
}
/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo*/


import java.util.Scanner;

public class ProblemaNM {

    public static void main(String[] args) {

            Scanner oli = new Scanner(System.in);
            
            System.out.println("Digite o numero de colunas: ");
            int m = oli.nextInt();
            System.out.println("Digie o numero de linhas: ");
            int n = oli.nextInt();
            
            int[][] matriz = new int[m][n];
            
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = oli.nextInt();
                }
            }
         
            int x = oli.nextInt();
            
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    if(matriz[i][j] == x){
                        System.out.println("Posição " + i + "," + j + ":");
                        if(j > 0){
                            System.out.println("Esquerda " + matriz[i][j-1]);
                        }
                        if(j < matriz[i].length-1){
                            System.out.println("Direita " + matriz[i][j+1]);
                        }
                        if(i > 0){
                            System.out.println("Cima " + matriz[i-1][j]);
                        }
                        if(i < matriz.length-1){
                            System.out.println("Abaixo " + matriz[i+1][j]);
                        }
                    }
                }
            }
        oli.close();
    }
}
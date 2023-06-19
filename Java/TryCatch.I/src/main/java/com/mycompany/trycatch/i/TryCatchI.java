package com.mycompany.trycatch.i;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aless
 */

public class TryCatchI {

    public static void main(String[] args) {

        Scanner oli = new Scanner(System.in);
        
        method1();
        
        System.out.println("End of program");
        
        oli.close();

    }
    
    public static void method1(){
        System.out.println("***METHOD 1 START***");
        method2();
        System.out.println("***METHOD 1 END***");
    }

    
    public static void method2(){
        System.out.println("***METHOD 2 START***");
        Scanner oli = new Scanner(System.in);

        try{ // o try "tenta" um método e usa o "catch" caso a tentativa não dê certo, ou realiza meios de tratar as excessões do código
             String[] test = oli.nextLine().split(" "); //O "split" é um método que delimita os espaços em branco, usado para dividir uma String em várias partes.
             int position = oli.nextInt();
             System.out.println(test[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace(); // Método que mostra quais excessões aconteceram no programa e onde estao elas.
            oli.next();
        }
        catch(InputMismatchException e){
            System.out.println("Input error");   
        }
        oli.close();
        System.out.println("***METHOD 2 END***");
    }
}

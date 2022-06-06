//Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite o valor do lado do quadrado:");
             float lado = input.nextFloat();

             float area__quadrado= lado * lado;

             System.out.println("A área do seu quadrado é: " +area__quadrado);

             input.close();
    }  
}  

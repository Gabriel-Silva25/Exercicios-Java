//Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite o valor da diagonal maior do losango:");
             float diagonal_maior = input.nextFloat();

            System.out.print("Digite o valor da diagonal menor do losango:");
             float diagonal_menor = input.nextFloat();

             float area__losango= (diagonal_maior * diagonal_menor)/2;

             System.out.println("A área do seu losango é: " +area__losango);

             input.close();
    }  
}  

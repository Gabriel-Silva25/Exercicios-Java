//Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite o valor da base do paralelogramo:");
             float base = input.nextFloat();

              System.out.print("Digite o valor da altura do paralelogramo:");
             float altura = input.nextFloat();

             float area__paralelogramo= base * altura;

             System.out.println("A área do seu paralelogramo é: " +area__paralelogramo);

             input.close();
    }  
}  

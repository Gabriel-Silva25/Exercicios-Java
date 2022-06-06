//Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite o valor da base maior do trapézio:");
             float base_maior = input.nextFloat();

            System.out.print("Digite o valor da base menor do trapézio:");
             float base_menor = input.nextFloat();

             System.out.print("Digite o valor da altura do trapézio:");
             float altura = input.nextFloat();

             float area__trapezio= (base_maior + base_menor) * altura /2;

             System.out.println("A área do seu trapézio é: " +area__trapezio);

             input.close();
    }  
}  
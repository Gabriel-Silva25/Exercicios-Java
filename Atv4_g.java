//Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
// O usuário irá informar os valores de cada variável.

import java.util.Scanner;

class Exercicio4 {

    public static void main(String[] args) {
       System.out.println("Escreva o valor do raio:");
       Scanner scan = new Scanner(System.in);

       double raio = scan.nextFloat();
       double area = Math.PI * (raio * raio);

       System.out.println("O valor da area do círculo é " + area);
    }
}


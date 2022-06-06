// 5) Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite um número : ");
             int numero = input.nextInt();

             if (numero>0) {
                  System.out.println("O número digitado é positivo");
             }
            if (numero<0) {
                System.out.println("O número digitado é negativo");
            }
             if (numero==0) {
                 System.out.println("O número digitado é zero");
             }
            
             input.close();
    }  
}  


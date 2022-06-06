// 7) Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite o primeiro número : ");
             int numero1 = input.nextInt();

              System.out.print("Digite o segundo número : ");
             int numero2 = input.nextInt();

              System.out.print("Digite o terceiro número : ");
             int numero3 = input.nextInt();

             if (numero1>numero2 && numero2>numero3) {
                 int soma=numero1+numero2;
                  System.out.println("A soma dos maiores números digitados é: "+ soma);
             }
            if (numero2>numero1 && numero1>numero3) {
                int soma=numero1+numero2;
                  System.out.println("O maior número digitado é: "+ soma);
             }
             if (numero1>numero2 && numero3>numero2) {
                int soma=numero1+numero3;
                  System.out.println("O maior número digitado é: "+ soma);
             }
             if (numero2>numero3 && numero3>numero1) {
                 int soma=numero2+numero3;
                  System.out.println("O maior número digitado é: "+ soma);
             }
            if (numero3>numero2 && numero2>numero1) {
                 int soma=numero2+numero3;
                  System.out.println("O maior número digitado é: "+ soma);
             }
             if (numero3>numero1 && numero1>numero2) {
                 int soma=numero1+numero3;
                  System.out.println("O maior número digitado é: "+ soma);
             }
             
             input.close();
    }  
}  
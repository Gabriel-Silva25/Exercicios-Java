//6) Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

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

             if (numero1>numero2 && numero1>numero3) {
                  System.out.println("O maior número digitado é: "+ numero1);
             }
            if (numero2>numero1 && numero2>numero3) {
                  System.out.println("O maior número digitado é: "+ numero2);
             }
             if (numero3>numero2 && numero3>numero1) {
                  System.out.println("O maior número digitado é: "+ numero3);
             }
             input.close();
    }  
}  


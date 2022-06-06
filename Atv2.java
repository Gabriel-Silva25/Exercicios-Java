// 2) Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);
          System.out.print("Digite seu nome:");

             String nome= input.nextLine();

             System.out.println("Olá, " + nome);

             input.close();
    }  
}  

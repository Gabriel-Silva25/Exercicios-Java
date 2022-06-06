//3) Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. 
//Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

          System.out.print("Digite seu nome:");
             String nome= input.nextLine();

             System.out.print("Digite sua idade:");
             int idade = input.nextInt();

             System.out.println("Olá, " + nome + ", sua idade é " +idade);

             input.close();
    }  
}  

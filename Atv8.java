//8) Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, 
//ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 

import java.util.Scanner;

 class Main {  
   public static void main(String args[]) {  
      Scanner input= new Scanner(System.in);

             System.out.print("Digite o primeiro número: ");
             float numero1 = input.nextFloat();

              System.out.print("Digite o segundo número: ");
             float numero2 = input.nextFloat();

             while (numero2==0 || numero2<0) {
                System.out.println("O número digitado é negativo ou zero. Informe outro número:");
                numero2 = input.nextFloat();
             }
             float divisão=numero1/numero2;
            
                 System.out.println("O resultado da divisão é: "+ divisão);
            
             input.close();
    }  
}  


package exercicios;

import java.util.Scanner;


public class exercicio_05{
    
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("digite um numero para calcular a tabuada de 1 - 10");
       var num = scanner.nextInt();
        for (var i = 1; i <= 10; i ++){
           System.out.printf("%s * %s = %s\n",num, i, num * i); 
        }
        scanner.close();
    }
}
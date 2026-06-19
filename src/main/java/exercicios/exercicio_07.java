package exercicios;

import java.util.Scanner;



public class exercicio_07{
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero ");
        var num1 = scanner.nextInt();
        System.out.println("Informe o segundo numero maior que o primeiro: ");
        var num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escolha uma opcao para gerar a faixa de numeros impares (i) ou pares (p) : ");
        var opcao = scanner.nextLine();
        for (int i = num1; i <= num2; i++){
            if (opcao.equalsIgnoreCase("p") && i % 2 == 0 ){
                System.out.println(i);
            }
            else if(opcao.equalsIgnoreCase("i") && i % 2 != 0 ){
                System.out.println(i);
            }
            
        }
        scanner.close();
    }
}
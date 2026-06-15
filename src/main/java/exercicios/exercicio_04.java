package exercicios;

import java.util.Scanner;



public class exercicio_04{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa 1: ");
        
        var pessoa1Nome = scanner.nextLine();
        System.out.printf("Informe a idade de %s: \n",pessoa1Nome);
        var pessoa1Idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o nome de 2 : ");
        var pessoa2Nome = scanner.nextLine();
        System.out.printf("Informe a idade de %s : \n",pessoa2Nome);
        var pessoa2Idade = scanner.nextInt();
        
        var diferenca = pessoa1Idade - pessoa2Idade;
        System.out.printf("A diferença de idade entre %s  e %s é de %s anos", pessoa1Nome, pessoa2Nome, diferenca);
        scanner.close();
        
        
    }
}

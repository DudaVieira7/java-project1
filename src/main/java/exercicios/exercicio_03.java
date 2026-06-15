package exercicios;

import java.util.Scanner;


public class exercicio_03{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informe a base do retângulo: ");
        var base = scanner.nextInt();
        System.out.println("Informe a altura do retângulo: ");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("O retângulo informado possui %s de base e %s de altura, portanto sua area é referente a %s \n",base,altura,area);
    }
    
}
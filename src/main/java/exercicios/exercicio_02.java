package exercicios;

import java.util.Scanner;

public class exercicio_02{
    public static void main(String[] args) {
       
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado que deseja verificar a area");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("O quadrado informado tem a area referente a %s \n",area);
    }
}

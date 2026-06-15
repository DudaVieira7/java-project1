package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;


public class exercicio_01{
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Informe o seu ano de nascimento: ");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá, %s sua idade é: (%s)",name, age);
    }
}
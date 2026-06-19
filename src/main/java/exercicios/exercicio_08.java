package exercicios;

import java.util.Scanner;


public class exercicio_08{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero : ");
        var primeiroNumero = scanner.nextInt();
        int numAtual;
        
        while(true){
            System.out.println("Informe o proximo numero: ");
            numAtual = scanner.nextInt();
            
            if (numAtual < primeiroNumero){
                System.out.println("O numero informado é menor que o primeiro");
                continue;
            }
            if (numAtual % primeiroNumero != 0 ){
                System.out.println("O resto atual da divisao entre os numeros e diferente de 0");
                System.out.println("fim de execucao!");
                break;
            }
            System.out.println("O numero ainda e valido para a divisão.");
        }
        scanner.close();
        
    }
}

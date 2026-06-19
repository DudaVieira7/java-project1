package exercicios;

import java.util.Scanner;


public class exercicio_06{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = scanner.nextLine();
        System.out.printf("Digite sua altura %s : \n",name);
        var height = scanner.nextFloat();
        System.out.printf("Digite seu Peso %s \n", name);
        var weight = scanner.nextFloat();
        
        var imc = weight /(height * height);
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc < 25){
            System.out.println("Peso ideal");
        }
        
        else if (imc < 30){
           System.out.println("Levemente acima do peso");
        }
        else if (imc < 35){
            System.out.println("Obesidade Grau I");
        }
        
        else if (imc < 40){
            System.out.println("Obesidade Grau II (Severa)");
        }
        else{
            System.out.println("Obesidade III (Mórbida)");
        }
        
        
        System.out.printf("%s seu imc e de : %.2f \n", name ,imc);
        scanner.close();
    }
}
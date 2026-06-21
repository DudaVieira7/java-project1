package exercicios;

import java.util.Scanner;


public class desafio_01{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o valor bruto do salario do funcionario: ");
        double valorBruto = scanner.nextDouble();
        System.out.println("Digite o valor bruto dos beneficios: ");
        double beneficios = scanner.nextDouble();
        double imposto;
        double valorReceber;
        
        if(valorBruto <= 1100){
          imposto = valorBruto * 0.05;
        }
        else if(valorBruto > 1100 && valorBruto <= 2500){
        imposto = valorBruto * 0.10;
        }
        else{
              imposto = valorBruto * 0.15;
        }
        
        valorReceber = (valorBruto - imposto) + beneficios;
        System.out.printf("O valor a receber é de %.2f ",valorReceber);
        scanner.close();
    }
}

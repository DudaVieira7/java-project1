package extruturas_de_controle;

import java.util.Scanner;


public class condicionais{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu Nome: ");
        var name = scanner.next();
        System.out.println("informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Voce e emancipado? S/N ");
        var isEmancipated = scanner.next().equalsIgnoreCase("S");
        
        if(age >= 18){ 
            System.out.printf(" %s voce pode dirigir, sua idade e %s  \n",name,age );
        }
        else if(age >= 16 && isEmancipated){
            System.out.println("apesar de ser jovem, voce pode dirigir");
        }
        
        else{
            
            var canDrive = 18 - age;
            System.out.printf("%s voce ainda e muito jovem nao pode dirigir! ainda faltam %s anos \n",name,canDrive);
        }
        
        System.out.println("Fim de execucao ");
        
       
    }
 
}

import java.util.Scanner;


public class operadores_aritmeticos{
    public static void main(String[] args) {
          var scanner = new Scanner(System.in);
          System.out.println("Inform the first number: ");
          var value1 = scanner.nextInt();
          System.out.println("inform de second number: ");
          var value2 = scanner.nextInt();
          
          System.out.printf("\n the first number is %s and the second number is %s this is equals = %s", value1, value2, value1 - value2);
   /*this is an example of how to use logical operations in your code, but you can also use others like +, /, %, *, or use the Match class for some specific calculations.*/
    }
    
}
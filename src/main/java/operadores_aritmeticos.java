
import java.util.Scanner;


public class operadores_aritimeticos{
    public static void main(String[] args) {
          var scanner = new Scanner(System.in);
          System.out.println("Inform the first number: ");
          var value1 = scanner.nextInt();
          System.out.println("inform de second number: ");
          var value2 = scanner.nextInt();
          
          System.out.printf("\n the first number is %s and the second number is %s this is equals = %s", value1, value2, value1 - value2);
    }
}
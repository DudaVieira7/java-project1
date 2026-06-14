
import java.util.Scanner;



public class operadores_logicos{
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("How old are you?");
       var age = scanner.nextInt();
       System.out.println("Are you Emancipated ?");
       var isEmancipated = scanner.nextBoolean();
       var ableToDrive = age >= 18 || isEmancipated && age >= 16; 
       System.out.printf("Can you drive? (%s) \n", ableToDrive);
       
}
           
}
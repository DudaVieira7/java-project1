/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mariaeduardavieira.java_project1;

import java.util.Scanner;

/**
 *
 * @author Maria Eduarda
 */
public class Java_project1 {
    
    private final static String WELCOME_MESSAGE = "Inform your name please: ";

    public static void main(String[] args) {
        
        // meu comentário de uma linha
        /* comentário de multiplas linhas em java*/
        
        
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        var name = scanner.next();
        System.out.println("inform your age: ");
        var age = scanner.nextInt();
        System.out.printf("Hello %s your age is %s \n", name, age);
    }
    
}

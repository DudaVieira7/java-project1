/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesFuncionais;

import java.util.List;

/**
 *
 * @author Maria Eduarda
 */
public class Main {
    public static void main(String[] args) {
        
        List<User> users = List.of(
                new User("Maria", 21),      // vai pegar o name e o age que tem no record.
                new User("Rhuan", 19),      
                new User("Eduardo", 23),
                new User("Beatriz", 15),
                new User("Marcelo", 49),
                new User("Diego", 35)
        );
        
      
        
    }
    
}

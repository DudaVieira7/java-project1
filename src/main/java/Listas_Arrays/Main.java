package Listas_Arrays;

import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {         // estrutura simples de uma lista tipada como string
        List<String> teste = new ArrayList<>();
        teste.add("A");
        var a = teste.get(0);
        
        
        
        
         int[] codes = new int[2];
         codes[0] = 789;                    // 1° forma de definição de array por indice
         codes[1] = 904;
        
         
         
         int[] newCode = {678,9006};       // 2° forma de definição de array
         
         System.out.println(newCode.length);
         System.out.println(codes.length);
         
         System.out.println(newCode[0]); // pega o primeiro valor do indice de newCode => 678
         
         
         List<Integer> codes2 = new ArrayList<>();
         codes2.add(newCode[0]);
         codes2.add(newCode[1]);
         
         
         System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
         
         
        codes2.forEach(System.out::println);
        codes2.add(23899);
        codes2.forEach(System.out::println);
        
        
        System.out.println("-*-*-===============================================================*-*-*");
        
        
        List<User> users = new ArrayList<>();
        
        var user = new User(1,"Maria");
        users.add(user);
        users.add(new User(2, "Bruna"));
        users.add(new User(3, "Pedro"));
        users.add(new User(5, "Luiz"));
        var tem = users.contains(user);    // verifica se users possui user.(contains)
        
        System.out.println(tem);
        System.out.println(users.size());
        System.out.println(users.getFirst());
        System.out.println(users.getLast());
        
        System.out.println(users.isEmpty());
    }
    
    
    
    

}
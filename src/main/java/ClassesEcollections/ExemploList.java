package ClassesEcollections;

import java.util.ArrayList;
import java.util.List;


public class ExemploList{
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(); // ArrayList é uma classe que implementa a interface list
        pessoas.add(new Pessoa("Joao",1l));
        
        Pessoa a = pessoas.get(0);
        
        
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getName());
        }
        
        System.out.println("----------------------------------------");
        pessoas.add(a);     // coloca outra vez a na lista (se refere duas vezes ao mesmo obj) diferente do set que é único.
        
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getName());
        }
    }

}
package ClassesEcollections;

import java.util.HashSet;
import java.util.Set;


public class ExemploSet{
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();      // não pode ter mais de 1 objeto igual
        
        Pessoa joao = new Pessoa("João",1l);
        pessoas.add(joao);
        
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getName());
        }
        
        // tentando adicionar joao novamente a lista;
        
        System.out.println("-----------------------------");
        
        pessoas.add(joao);
        
        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getName());
        }
        
    }
}
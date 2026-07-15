/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesEcollections;

import java.util.Objects;

/**
 *
 * @author Maria Eduarda
 */
public class Pessoa {
    private String name;
    private Long id;
    
    public String getName(){
        return this.name ;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public Long getId(){
        return this.id;
    }
    
    
    public void setId(Long id){
        this.id = id;
    }
    
    
    public Pessoa(String name, Long id){
        this.name = name;
        this.id = id;
    }
    
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o ;
        return id.equals(pessoa.id) && name.equals(pessoa.name);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }
}

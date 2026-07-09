/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncoesLambda;

/**
 *
 * @author Maria Eduarda
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome( String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this. idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
    public Pessoa (String nome, int idade){         // método construtor com parâmentros
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa (){           // construtor sem parâmetro.
    
    }
}

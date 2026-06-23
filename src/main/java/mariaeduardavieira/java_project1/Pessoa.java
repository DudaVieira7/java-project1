/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mariaeduardavieira.java_project1;

/**
 *
 * @author Maria Eduarda
 */
public class Pessoa {
   
      private String nome;
      private int idade;
      
      public String getNome(){
          return nome;
      }
     public void setNome(String nome){
         this.nome = nome; // this faz referência ao objeto.
         
     }
     
     // get e set são os métodos que  funcionam da seguinte forma:
     
     //o get: sempre retorna o valor do atributo; ** GET (busca/obtem e retorna o valor) ***
     
     //e o set vai atualizar, modificar ou atribuir um novo valor para o atributo.** SET (insere/define o valor) ***
     
     public int getIdade(){
         return idade;
     }
     public void setIdade( int idade){
         if(idade > 0 ){                //nesse setIdade(verifica se a idade é maior que 0 caso sim é atribuido a idade.)
             this.idade = idade;
         }
         
     }
     
    
}

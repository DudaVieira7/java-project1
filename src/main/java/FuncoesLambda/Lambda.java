/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncoesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Maria Eduarda
 */

interface OperacaoMatematica{
    int calcular(int a , int b);
}


interface ManipuladorString{
    String manipular(String str);
}

public class Lambda {
    public static void main(String[] args) {
        
        OperacaoMatematica soma = new OperacaoMatematica(){
            @Override                                               // forma comum  mas maior para implementar a interface.
            public int calcular(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println(soma.calcular(2, 8));
        
        
        // fazendo o mesmo procedimento com o uso das funções lambda:
        
        // função lambda você passa os parametros e chama a função lambda exemplo:  nomeInterface nomeMetodo = (parametros) -> função lambda
        
        
        OperacaoMatematica somaL = (a,b) -> a + b ;
        
        
        
        System.out.println(somaL.calcular(5, 6));
        
        
        
        OperacaoMatematica multiplicacao = (a,b) -> a * b;
        
         System.out.println(multiplicacao.calcular(5, 7));
          System.out.println("Multiplicação com função lambda: " + multiplicacao.calcular(5, 7));
          
          
          
          
          
          
           // manipulando Strings com funções lambda
           
            ManipuladorString maiuscula = new  ManipuladorString(){
            @Override
            public String manipular(String str) {                       // formato sem lambda 

                return str.toUpperCase();
            }
            };
            
            System.out.println("Manipulação de String:  (sem lambda )" + maiuscula.manipular("Fada da computacao"));
            
            
          
            ManipuladorString maiusculaFL = str -> str.toUpperCase();       // formado com lambda
            System.out.println("Manipulação de String:  (com lambda )" + maiusculaFL.manipular("Fada da computacao"));
            
            
            
            
            
            // usando  o filter
            
            List<String> palavras = Arrays.asList("java","python","typeScript","javaScript",
                    "Julia","Php","SQL","C++","Go","Rust","Swift","Ruby","Dart","C#");
            
            List<String> palavrasFiltradas = new ArrayList<>();
            
            for(String palavra : palavras){
                if(palavra.length() > 5){                                   // método sem função lambda
                    palavrasFiltradas.add(palavra);
                }
            }
            
          System.out.println("Palavras com mais de cinco letras filtrada sem função lambda" + palavrasFiltradas);
          
          
           List<String> palavrasFiltradasFL = palavras.stream().filter(s -> s.length() > 5).toList();    // ultilizando a função lambda.
           
           System.out.println("Palavras com mais de cinco letras filtrada com função lambda: " + palavrasFiltradasFL);
          
    }
    
}

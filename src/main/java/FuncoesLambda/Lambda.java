/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncoesLambda;

/**
 *
 * @author Maria Eduarda
 */

interface OperacaoMatematica{
    int calcular(int a , int b);
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
    }
    
}

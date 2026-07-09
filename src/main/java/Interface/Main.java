/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;



/**
 *
 * @author Maria Eduarda
 */
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        
        gato.fazerSom();
        gato.movimentar();
        cachorro.fazerSom();
        cachorro.movimentar();
    }
    
}

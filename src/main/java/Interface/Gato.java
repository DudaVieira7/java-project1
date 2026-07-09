/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Maria Eduarda
 */
public class Gato implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void movimentar() {
        System.out.println("O gato está andando.");
    }
    
}

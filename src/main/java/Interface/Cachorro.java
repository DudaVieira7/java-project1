/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Maria Eduarda
 */
public class Cachorro implements Animal { // implements é tipo o extends das classes.

    @Override
    public void fazerSom() {
        System.out.println("Au, au");
    }

    @Override
    public void movimentar() {
        System.out.println("Cachorro está andando");
    }
    
}

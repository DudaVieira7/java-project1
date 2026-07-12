/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ex3_interfaces;

/**
 *
 * @author Maria Eduarda
 */
public record Circle(double radius) implements GeometricForm {
    
    private static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (radius * radius); 
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ex3_interfaces;

/**
 *
 * @author Maria Eduarda
 */
public record Rectangle(double height, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return base * height; 
    }

}

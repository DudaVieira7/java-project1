/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ex2_interfaces;

/**
 *
 * @author Maria Eduarda
 */
public record Vestuario(double valor) implements ValorTributario {

    @Override
    public double valorTributo() {
        return this.valor * 0.025;
    }

}

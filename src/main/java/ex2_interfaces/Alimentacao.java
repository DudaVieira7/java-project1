/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ex2_interfaces;

/**
 *
 * @author Maria Eduarda
 */
public record Alimentacao(double valor) implements ValorTributario {

    @Override
    public double valorTributo() {  //metodo implementado da interface, pega o valor e realiza o calculo valor imposto.
        return this.valor * 0.01;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_interfaces;

/**
 *
 * @author Maria Eduarda
 */
public class Marketing {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Email email = new Email();
        RedeSocial rds = new RedeSocial();
        WhatsApp wt = new WhatsApp();
        
        sms.enviarMensagem();       // testando serrviços da interface sms
        System.out.println("A mensagem é do tipo : " + sms.getTipoServico());
        
        
        
        email.enviarMensagem();
        System.out.println("A mensagem é do tipo : " + email.getTipoServico());
                                                                                                    
        rds.enviarMensagem();
        System.out.println("A mensagem é do tipo : " + rds.getTipoServico());
        
        wt.enviarMensagem();
        System.out.println("A mensagem é do tipo : " + wt.getTipoServico());
        
        
        
    
    }
    
}

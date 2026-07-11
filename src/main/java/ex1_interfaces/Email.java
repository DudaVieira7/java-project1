package ex1_interfaces;


public class Email implements Mensagem{

    @Override
    public void enviarMensagem() {
         System.out.println("Enviando a mensagem no formato (E-mail)");
    }

    @Override
    public String getTipoServico() {
       return "E-Mail";
    }

}

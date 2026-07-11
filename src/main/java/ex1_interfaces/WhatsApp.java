package ex1_interfaces;


public class WhatsApp implements Mensagem{

    @Override
    public void enviarMensagem() {
         System.out.println("Enviando a mensagem no formato  do (WhatsApp)");
    }

    @Override
    public String getTipoServico() {
        return "WhatsApp";
    }

}

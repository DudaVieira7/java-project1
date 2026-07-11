package ex1_interfaces;


public class SMS implements Mensagem{

    @Override
    public void enviarMensagem() {
       System.out.println("Enviando a mensagem no formato (SMS)");
    }

    @Override
    public String getTipoServico() {
        return "SMS";
    }

}
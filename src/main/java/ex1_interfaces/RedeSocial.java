package ex1_interfaces;


public class RedeSocial implements Mensagem{

    @Override
    public void enviarMensagem() {
         System.out.println("Enviando a mensagem no formato (RedeSocial)");
    }

    @Override
    public String getTipoServico() {
        return "Redes Sociais";
    }

}

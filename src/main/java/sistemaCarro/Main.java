package sistemaCarro;


public class Main{
    public static void main(String[] args) {
        
        /*Criando um novo carro para testar as funções criadar na classe do carro*/
        
        Carro carro = new Carro();
        System.out.println("Estado inicial da criaççao do veículo");
        carro.verifcarVelocidade();
        carro.acelerarCarro(); 
        carro.ligarCarro();
        carro.verifcarVelocidade();
        System.out.println("A marcha atual do veículo é : " + carro.getmarcha());
        System.out.println("Subindo e diminuindo a marcha atual");
        carro.diminuirMarcha();
        carro.subirMarcha();
        System.out.println("A marcha atual do veículo é : " + carro.getmarcha());
        carro.diminuirMarcha();
        System.out.println("A marcha atual do veículo é : " + carro.getmarcha());
        carro.virarCarro("direita");
        carro.subirMarcha();
         carro.virarCarro("direita");
         carro.verifcarVelocidade();
         carro.acelerarCarro();
         carro.acelerarCarro();
         carro.acelerarCarro();
         carro.acelerarCarro();
         
         carro.virarCarro("direita");
         carro.virarCarro("esquerda");
         carro.subirMarcha();
         carro.desligarCarro();
         carro.acelerarCarro();
         carro.acelerarCarro();
         carro.acelerarCarro();
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.diminuirMarcha();
        carro.diminuirVelocidade();
        carro.verifcarVelocidade();
        carro.diminuirVelocidade();
        carro.verifcarVelocidade();
        
        carro.desligarCarro();
        carro.diminuirMarcha();
        carro.desligarCarro();
        System.out.println("A marcha atual do veículo é : " + carro.getmarcha());
        carro.verifcarVelocidade();
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.desligarCarro();
    }
}
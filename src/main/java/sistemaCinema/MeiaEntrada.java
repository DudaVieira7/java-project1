package sistemaCinema;


public final class MeiaEntrada extends Ingresso{
    public MeiaEntrada(double valor, String nome, boolean dublado){
        super(valor, nome, dublado);
    }
    
    @Override                       // essa parte do Override realiza a atribuição para o método abstrato da  classe mãe.
    public double valorReal(){
        return getValor() / 2;     // divide o valor por 2 para pegar o valor da meia entrada.
    }
}
package sistemaCinema;


public final class IngressoFamilia extends Ingresso{
    
    private int pessoas;
    
   
    
    
    public IngressoFamilia(double valor, String nome, boolean dublado, int pessoas){
        super(valor, nome, dublado);
        this.pessoas = pessoas;
    }
    
   
    
    @Override
    public  double valorReal(){
        double valorTotal = getValor() * this.pessoas;
        double desconto = 0;
        if (pessoas > 3){
           desconto = valorTotal * 0.05;  
        }
        return valorTotal - desconto;
        
    }
}
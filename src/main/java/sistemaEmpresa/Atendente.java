package sistemaEmpresa;


public final class Atendente extends Usuario{
    
    private double valorEmCaixa;
    private boolean caixaAberto;

    public Atendente(String nome, String senha, String email){
        super(nome, senha,email,false);
        this.valorEmCaixa = 0.0;
        this.caixaAberto = false;       // caixa inicia vazio e fechado no momento da criação.
    }
    
    
    public void caixaStatus(){
        if(this.caixaAberto == true){
            System.out.println("O status atual  do caixa é (ABERTO)");
        }else{
            System.out.println("O status atual  do caixa é (FECHADO)");
        }
    }
    
    
    public void setCaixaAberto(boolean aberto){
        
        if(isLogado() && !this.caixaAberto){
            this.caixaAberto = true;
            System.out.println("O caixa foi aberto!");
        }else{
            System.out.println("ERRO.Não foi possível abrir o caixa!");
        }    
    }
     public void setCaixaFechado(boolean aberto){
        
        if(isLogado() && this.caixaAberto){
            this.caixaAberto = false;
            System.out.println("O caixa foi fechado!");
        }else{
            System.out.println("ERRO.Não foi possível fechar o caixa!");
        }    
    }
    
    
    public void receberPagamento(double valor){
        if(isLogado() && this.caixaAberto == true){
            this.valorEmCaixa += valor;
            System.out.println("O valor foi adcionado ao caixa.");
        }else{
            System.out.println("Usuário deslogado ou caixa fechado");
        }
    }
    
}
package sistemaEmpresa;


public final class Vendedor extends Usuario{
    
    private int quantidadeVendas;

    public Vendedor(String nome, String senha, String email){
        super(nome, senha,email,false);
        this.quantidadeVendas = 0;      // momento da criação o vendedor não vendeu nada ainda.
    }
    
    public void realizarVenda(){
        if(isLogado()){
             this.quantidadeVendas += 1;
             System.out.println("A venda foi realizada com sucesso.");
        }
        else{
            System.out.println("ERRO.Vendedor não foi logado no sistema.");
        }
       
    }
    
    public int getVendas(){
        return this.quantidadeVendas;
    }
}
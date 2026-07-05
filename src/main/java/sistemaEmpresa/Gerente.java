package sistemaEmpresa;



public final class Gerente extends Usuario{
    
    
    
    public Gerente(String nome, String senha, String email){
        super(nome,senha,email, true);
    }
    
    public void geraRelatorio(){
    if(isLogado()){
        System.out.println("==========RELATÓRIO FINANCEIRO DA EMPRESA==========");
        System.out.println("Faturamento Bruto: R$ 50.000,00");
            System.out.println("Despesas Operacionais: R$ 15.000,00");
            System.out.println("Lucro Líquido: R$ 35.000,00");
            System.out.println("---------------------------------------");
    }else{
        System.out.println("ERRO.Gerente precisa estar logado para gerar o relatório financeiro.");
    }
    
    }
    public void consultarVendas(){
        if(isLogado()){
            System.out.println("Consultando histórico de vendas.");
        }else{
             System.out.println("ERRO.Gerente precisa estar logado para consultar histórico de vendas.");
        }
    }

}

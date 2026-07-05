package sistemaEmpresa;


public class Main{
    public static void main(String[] args) {
       Gerente gerente = new Gerente("maria","Maria123","maria@empresa.com"); 
       Vendedor vendedor = new Vendedor("Luana","12345678","luana@empresa.com");
       Atendente atendente = new Atendente("Matheus","325611mat","matheus@empresa.com");
       
       // testando a classe Gerente
       
       System.out.println("### Testando Gerente ###");
       gerente.geraRelatorio();
       gerente.fazerLogin();
       gerente.geraRelatorio();
       gerente.consultarVendas();
       gerente.fazerLogOut();   
       System.out.println();
       
       // testando a classe atendente
       System.out.println("### Testando Atendente ###");
       atendente.setCaixaAberto(true);
       atendente.fazerLogin();
       atendente.setCaixaAberto(true);
       atendente.caixaStatus();
       atendente.setCaixaFechado(false);
       atendente.caixaStatus();
       atendente.setCaixaAberto(true);
       atendente.receberPagamento(150.50); 
       atendente.receberPagamento(50.00);
       System.out.println("O valor em caixa é de : R$"+atendente.getValorEmCaixa());
       
       System.out.println();
       
       // testando a classe vendedor
       
       vendedor.realizarVenda();
       vendedor.fazerLogin();
       vendedor.realizarVenda();
       vendedor.realizarVenda();
       System.out.printf("Total de vendas do %s: %s",vendedor.getNome(), vendedor.getVendas());
       vendedor.fazerLogOut();
       System.out.println();
       
       System.out.println("finalizando testes de classes do sistema da Empresa!");
    }
    
    
}
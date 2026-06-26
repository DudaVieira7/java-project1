package sistemaBancario;


public class Main{
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria Eduarda Vieira","123.456.789-00");
        System.out.println("Usuario criada com sucesso!");
        ContaBancaria conta = new ContaBancaria(cliente, 100);
        System.out.printf("Titular da conta: %s \n", cliente.getNome());
        System.out.printf("Saldo Inicial da conta: R$ %s",conta.getSaldo());
        System.out.printf("O limite do Cheque Especial de %s é de R$ %s \n", cliente.getNome(), conta.consultarCheque());
        
        
        System.out.println("------------------------------TESTE DE SAQUE--------------------------------------------");
        conta.sacar(40);
        System.out.println();
        
        
        
        System.out.println("--------------------------TESTE DE SAQUE USANDO O CHEQUE ESPECIAL---------------------");
        System.out.println("Está usando cheque especial atualmente? " + conta.UsandoCheque());
        conta.sacar(90);
        System.out.println("Está usando cheque especial atualmente? " + conta.UsandoCheque());
        
        
        
        System.out.println("--------------------------TESTE DE SAQUE ACIMA LIMITE--------------------------------");
        conta.sacar(150);
        
        
        System.out.println("--------------------------TESTE DE DEPOSITO ----------------------------------------");
        conta.depositar(800);
        conta.depositar(400);
        conta.pagarBoleto(400);
        System.out.println("Está usando cheque especial atualmente? " + conta.UsandoCheque());
        
    }
    

}
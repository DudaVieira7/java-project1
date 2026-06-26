package sistemaBancario;


public class ContaBancaria{
private Cliente titular;  
private double saldo;
private double chequeEspecial;
private double chequeUsado;
private boolean chequeEmUsamento;


public ContaBancaria(Cliente titular, double depositoInicial){
    this.titular = titular;
    this.saldo = depositoInicial;
    this.chequeUsado = 0.0;   // iniciamos como falso pois atribuimos que o cliente ainda não usou o cheque especial.
    this.chequeEmUsamento = false;
    
    if(depositoInicial <= 500){ 
    this.chequeEspecial = 50;
    }else{
    this.chequeEspecial = depositoInicial * 0.5; // se for maior que 500 o cheque especial vai ser de 50% do valor depositado.
    }
    
}

public double getSaldo(){       // retorna o valor do saldo sem o cheque atribuido ao valor.
    return this.saldo;
}

public double sTotalDisponivel(){
    return this.saldo + this.chequeEspecial;
    }


public double consultarCheque(){        // retorna apenas o valor do limite do cheque disponível.

    return this.chequeEspecial;
}




public void depositar( double valor){
   if(this.chequeUsado > 0){
   double taxa = chequeUsado *0.2;
   System.out.println("Cobrado 20% do cheque especial no valor de R$" + taxa);
   valor = valor - this.chequeUsado - taxa;
   
   this.chequeUsado = 0.0;
   this.chequeEmUsamento = false;
   }
   
   this.saldo += valor;
   System.out.printf("Foi realizado um deposito de R$ %s na sua conta, seu saldo atual é de R$%s \n",valor,this.saldo);
}





public void sacar(double valor){
    double totalDisponivel = sTotalDisponivel();
    if(valor > totalDisponivel){
        System.out.println("Saldo e Limite de Cheque Especial insuficientes para este saque!");
        return;
    }if(valor <= this.saldo){
        this.saldo -= valor;
    }else{
        double restante = valor - this.saldo;
        this.saldo = 0.0;
        this.chequeUsado += restante;
        this.chequeEmUsamento = true;
    }
    System.out.printf("Saque de R$ %s realizado! Saldo atual: R$ %s Dívida no Cheque Especial: R$ %s \n", valor,this.saldo,this.chequeUsado);
}

public void pagarBoleto(double valor){
    double totalDisponivel = sTotalDisponivel();
    if(valor > totalDisponivel){
        System.out.println("Saldo e Limite de Cheque Especial insuficientes para pagar o boleto!");
        return;
    }if(valor <= this.saldo){
        this.saldo -= valor;
    }else{
        double restante = valor - this.saldo;
        this.saldo = 0.0;
        this.chequeUsado += restante;
        this.chequeEmUsamento = true;     
    }
    System.out.printf("Boleto pago com sucesso! Saldo atual: R$ %s. Dívida no Cheque Especial: R$ %s \n", this.saldo,this.chequeUsado);
}


public boolean UsandoCheque(){
    return this.chequeEmUsamento;
    
}




}
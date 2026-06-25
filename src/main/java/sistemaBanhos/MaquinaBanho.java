package sistemaBanhos;


public class MaquinaBanho{
    private Pet petAtual;
    private int nivelAgua;
    private int nivelShampoo;
    private boolean precisaLimpar;
    
    // delimitando o nível maximo de recursos:
    
    private final int maxNvAgua = 30;
    private final int maxNvShampoo = 10;
    
    // consumo por banho:
    
    private final int cAguaBanho = 10;
    private final int cShampooBanho = 2;
    
    
    // consumo para a limpeza da máquina após utilizada:
    
    private final int cAguaLimpeza = 3;
    private final int cShampooLimpeza = 1;
    
    
    //construtor para inicialisar a maquina de banhos:
    
    public MaquinaBanho(){
        this.petAtual = null;
        this.nivelAgua = 0;             // começa com tudo zerado.
        this.nivelShampoo = 0;
        this.precisaLimpar = false;
    }
    
    
    // 1° operação da maquina de banhos (COLOCAR O PET NA MAQUINA):
    
    public void colocarPet(Pet pet){
        if(this.petAtual != null){
            System.out.println("Não foi possível colocar "+ pet.getName() +" na maquina, está ocupada por: " + this.petAtual.getName() + " no momento.");
        } else if(precisaLimpar){
            System.out.println("A máquina precisa de limpeza para o próximo atendimento");
        } else{
            this.petAtual = pet;
            System.out.println("O pet: "+ pet.getName() +"entrou no banho agora");
        }
    
    }
    
    
   //2° operação da máquina de banhos (VERIFICAR RECURSOS) e (ABASTECER) e (DAR BANHO):
    
    public void darBanho(){
        if(this.petAtual == null){
            System.out.println("ERRO, sem pet para dar banho");
            return;
        }
        if (this.nivelAgua < cAguaBanho || this.nivelShampoo < cShampooBanho){
            System.out.println("ERRO, abasteça os recursos da máquina para começar a Tarefa.");
            return;
        }
       
            this.nivelAgua -= cAguaBanho;
            this.nivelShampoo -= cShampooBanho;
            
            this.petAtual.setClean(true);
            System.out.println("Agora: " +this.petAtual.getName() +"está limpinho");
       
    }
    
    
   // 4° operação da máquina (RETIRAR PET):
    public void tirarBanho(){
        if(this.petAtual == null){
            System.out.println("ERRO, sem pet para tirar do banho."); return;
        }
        if(!this.petAtual.getIsClean()){
            this.precisaLimpar = true;
        System.out.println(this.petAtual.getName() +" saiu da maquina e precisa ser limpa.");
        }
        else{
        System.out.printf("Maquina livre %s e está limpo.",this.petAtual.getName());
        }
        this.petAtual = null;
    
    }
   
    
   // 5° operação da máquina (LIMPAR APÓS USO):
   
    public void limparMaquina(){
    if (this.nivelAgua < cAguaLimpeza || this.nivelShampoo < cShampooLimpeza){
            System.out.println("ERRO, abasteça os recursos da máquina para começar a Tarefa.");
            return;
        }
       
            this.nivelAgua -= cAguaLimpeza;
            this.nivelShampoo -= cShampooLimpeza;
            this.precisaLimpar = false;
            System.out.println("A máquina foi limpa e esterilizada com sucesso.");
    }
    
    public void abasteceragua(){
        if((nivelAgua + 2)<= maxNvAgua ){
        this.nivelAgua += 2;
        }
    
    }
     public void abastecerShampoo(){
        if((nivelShampoo + 2)<= maxNvShampoo ){
        this.nivelShampoo += 2;
        }
    
    }
    
}
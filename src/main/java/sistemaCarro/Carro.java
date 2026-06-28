package sistemaCarro;


public class Carro{
    private boolean ligado;
    private int velocimetro;
    private int marcha;
   
    
    
    public Carro(){
    this.ligado = false;      //Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
    this.velocimetro = 0;
    this.marcha = 0;
    }
    
    public void ligarCarro(){
        if(ligado == true){
            System.out.println("O veículo já está ligado");
            return;
        }
        this.ligado = true;
        System.out.println("O veículo foi ligado com sucesso!");
        
    }
    
    public void desligarCarro(){
        if(ligado == false){
            System.out.println("O veículo já está desligado");
            return;
        }
        if(velocimetro == 0 && marcha == 0){
        this.ligado = false;
        System.out.println("O veículo foi desligado com sucesso!");
        }else{
        System.out.println("Não é possível desligar o carro em movimento ou engatado!");
        }
        
    }
    
    public void acelerarCarro(){
        if(ligado == false || marcha == 0){
            System.out.println("Imposível acelerar o carro.");
            return;
        }
        int limiteVel = 0;
        if(this.marcha == 1) limiteVel = 20;
        else if(this.marcha == 2) limiteVel = 40;
        else if(this.marcha == 3) limiteVel = 60;
        else if(this.marcha == 4) limiteVel = 80;
        else if(this.marcha == 5) limiteVel = 100;
        else if(this.marcha == 6) limiteVel = 120;
        
        if(this.velocimetro < limiteVel){
            this.velocimetro += 1; 
            System.out.printf("Acelerando... Velocidade atual: %d km/h (Marcha %d)\n", this.velocimetro, this.marcha);
        }
        else{
            System.out.printf("Você atingiu o limite de %d km/h para a %dª marcha! Passe a marcha para continuar acelerando.\n", limiteVel, this.marcha);
        }
       
    }
    
    public void diminuirVelocidade(){
        if(ligado == false || velocimetro == 0){
            System.out.println("Imposível diminuir a velocidade do carro.");
            return;
        }
        this.velocimetro -= 1;
        
    }
    
    public void subirMarcha(){
        if(ligado == false){
             System.out.println("Imposível trocar a marcha com o  carro desligado.");
             return;
        }
       if(marcha < 6){
           this.marcha += 1;
           System.out.println("Trocou de marcha agora é :" +this.marcha);
       }else{
           System.out.println("Não tem  como subir mais a marcha. a marcha é :"+ this.marcha);
           return;
       }
    }
    public void diminuirMarcha(){
     if(ligado == false ){
        System.out.println("Imposível trocar a marcha.");
             return;  
     }
     if(marcha > 0){
         this.marcha -= 1;
         System.out.println("Trocou de marcha agora é :" +this.marcha);
     }else{
           System.out.println("Não tem  como diminuir mais a marcha. a marcha é :"+ this.marcha);
           return;
       }
     
    }
    public void virarCarro(String direcao){
        if(ligado == false){ 
            System.out.println("Imposível trocar a marcha.");
            return; 
        }
    }

}
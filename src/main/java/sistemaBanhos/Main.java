package sistemaBanhos;

public class Main {
    public static void main(String[] args) {
        
        MaquinaBanho maquina = new MaquinaBanho();
        Pet pet1 = new Pet("Thor");
        Pet pet2 = new Pet("Mel");

        System.out.println("=== 🐶 SIMULAÇÃO DO PETSHOP INDO À FALÊNCIA (SEM RECURSOS) ===");
        maquina.colocarPet(pet1); 
        maquina.darBanho();      
        maquina.tirarBanho();     

        System.out.println("\n=== 🧼 TENTANDO COLOCAR OUTRO PET COM A MÁQUINA SUJA ===");
        maquina.colocarPet(pet2); 

        System.out.println("\n=== 🚰 ABASTECENDO A MÁQUINA REPETIDAMENTE ===");
        // Vamos colocar 12 litros de água (chamando 6 vezes)
        for (int i = 0; i < 6; i++) {
            maquina.abasteceragua();
        }
        // Vamos colocar 4 litros de shampoo (chamando 2 vezes)
        maquina.abastecerShampoo();
        maquina.abastecerShampoo();

        System.out.println("\n=== ✨ LIMPANDO A MÁQUINA E REFAZENDO O FLUXO ===");
        maquina.limparMaquina();  
        maquina.colocarPet(pet2);
        maquina.darBanho();       
        maquina.tirarBanho();     
    }
}
package sistemaBanhos;


public class Pet{
    private String name;
    private boolean clean;
    
    // método para criar o registro do pet no petshop (CONSTRUTOR REGISTRO DO PET)
    public Pet(String name){
        this.name = name;
        this.clean = false; // pet entra no sistema sujinho
    }
    
    public String getName(){
        return name;
    }
    
    public boolean getIsClean(){
     return clean;
    }
    
    public void setClean(boolean clean){
        this.clean = clean;
    }
}
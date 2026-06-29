package herancaPolimorfismo;


public class Manager extends Employee{  //( extends)-> junta características de outra classe.
    private String login;
    private String password;
    private double commision;
    
    
    
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
    this.login = login;
    }
    
    
    
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    
    public double getCommision(){
        return this.commision;
    }
    public void setCommision(double commision){
      this.commision = commision;  
    }
    
    
}

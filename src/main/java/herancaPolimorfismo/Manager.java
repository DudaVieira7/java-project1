package herancaPolimorfismo;


public non-sealed class Manager extends Employee{  //( extends)-> junta características de outra classe.
    private String login;
    private String password;
    private double commision;
    
  public Manager(String code,
                    String name,
                    String adress,
                    int age,
                    double salary,
                    String login,
                    String password,
                    double commision){
      super(code, name, adress, age, salary);   // essa parte funciona como se fosse as chaves estrageira da classe mãe;
      this.login = login;
      this.password = password;
      this.commision = commision;
       
    }
  @Override
   public String getCode(){
       return "MN" + super.getCode();
   }
   
  
  public Manager(){}
    
    
    
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

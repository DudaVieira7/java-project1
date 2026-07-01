package herancaPolimorfismo;


public  non-sealed class SalesPerson extends Employee{
    private double percentPerSold;
    
   public SalesPerson(String code,
                      String name,
                      String adress,
                      int age,
                      double salary,
                      double percentPerSold){
        super(code, name, adress, age, salary);
        this.percentPerSold = percentPerSold;
   }
   
   @Override
   public String getCode(){
       return "SL" + super.getCode();
   }
  
   
   public SalesPerson(){}
    
    
    public double getPercentPerSold(){
        return this.percentPerSold;
    }
    
    public void setPercentPerSold(double percentPerSold){
     this.percentPerSold = percentPerSold;
    }
}
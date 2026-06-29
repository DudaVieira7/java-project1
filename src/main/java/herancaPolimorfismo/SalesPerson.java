package herancaPolimorfismo;


public  non-sealed class SalesPerson extends Employee{
    private double percentPerSold;
    
    
    public double getPercentPerSold(){
        return this.percentPerSold;
    }
    
    public void setPercentPerSold(double percentPerSold){
     this.percentPerSold = percentPerSold;
    }
}
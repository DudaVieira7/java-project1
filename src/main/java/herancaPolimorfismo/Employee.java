package herancaPolimorfismo;


public sealed abstract class Employee permits Manager, SalesPerson{     // uma classe abstrata não pode ser instância
    
   protected String code;
   protected String name;
   protected String adress;
   protected int age;
   protected double salary;
    
    
    public String getCode(){
        return this.code;
    }                                           // code
    public void setCode(String code){
        this.code = code;
    }
    public Employee(String code,
                    String name,
                    String adress,
                    int age,
                    double salary){
        this.code = code;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){}
    
    
    public String getName(){
        return this.name;
    }                                           // name
    public void setName(String name){
        this.name = name;
    }
    
    
    
    public String getAdress(){
        return this.adress;
    }                                           // adress 
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    
    
    public int getAge(){
        return this.age;
    }                                                       //age
    public void setAge(int age){
        this.age = age;
    }
    
    
    public double getSalary(){
        return this.salary;
    }                                               // salary
    public void setSalary(double salary){
        this.salary = salary;
    }
    

}
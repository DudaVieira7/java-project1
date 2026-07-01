package herancaPolimorfismo;


public class Main{
    public static void main(String[] args) {
      printEmployee(new Manager());
      printEmployee(new SalesPerson());
    }
    
    
    public static void printEmployee(Employee employee){
        
        System.out.printf(("==============%s=================\n"),employee.getClass().getCanonicalName());
        if (employee instanceof Manager){
        
      
        }
        switch (employee){                  // funciona com o switch case sem o default porque pegou todos os cenários possíveis.
            case Manager manager ->{
                employee.setCode("123");
                employee.setName("Maria");
                employee.setSalary(5500);
                manager.setCommision(1200);
                manager.setLogin("mariavieira");
                manager.setPassword("123456");
                
                System.out.println(employee.getCode());
                System.out.println(employee.getName());
                 System.out.println(employee.getSalary());
                 System.out.println(manager.getCommision());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
            }
            case SalesPerson salesperson ->{
                salesperson.setCode("457");
                salesperson.setName("João");
                salesperson.setSalary(2800);
                salesperson.setPercentPerSold(25);
             
                
                System.out.println(employee.getCode());
                System.out.println(employee.getName());
                System.out.println(employee.getSalary());
                
            
            }
        }
         System.out.println("==============================================");
    }

}
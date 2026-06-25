package mariaeduardavieira.java_project1;


public class Main{
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(20);
        
        System.out.println(p.getIdade());
        System.out.println("A pessoa se chama: " + p.getNome() +" e tem " + p.getIdade() + " anos");
    }
}
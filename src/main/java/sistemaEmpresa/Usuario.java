package sistemaEmpresa;


public abstract sealed class Usuario permits Vendedor, Gerente, Atendente{
    private String nome;
    private String senha;
    private String email;
    private boolean administrador;
    private boolean logado;
    
    
    public Usuario(String nome, String senha, String email, boolean administrador){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.administrador = administrador;
        this.logado = false;                    // inicia logado como falso no inicio da criação.
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public boolean isADM(){
        return this.administrador;           // verifica se o usuario é um administrador.
    }
    
    
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    
    public void fazerLogin(){
        this.logado = true;
        System.out.println("Usuário realizou o login. ");
    }
    
    public void fazerLogOut(){
        this.logado = false;
        System.out.println("Usuário saiu do sistema.");
    }
    
    public  boolean isLogado (){
        return this.logado;
    }
    

}
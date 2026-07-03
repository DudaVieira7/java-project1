package sistemaCinema;


public abstract sealed class Ingresso permits MeiaEntrada, IngressoFamilia{
    private double valor;
    private String nome;
    private boolean dublado;
    
    public Ingresso(double valor, String nome, boolean dublado){
        this.valor = valor;
        this.nome = nome;
        this.dublado = dublado;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public abstract  double valorReal();
}
package ex2_interfaces;


public class Main{
    
    public static void main(String[] args) {
        Alimentacao arroz = new Alimentacao(25.0);
        Vestuario vestido = new Vestuario(569.99);
        SaudeBemEstar creme = new SaudeBemEstar(66.00);
        Cultura livro = new Cultura(55.00);
        
        double impostoL = livro.valorTributo();
        double impostoA = arroz.valorTributo();
        double impostoV = vestido.valorTributo();
        double impostoC = creme.valorTributo();
        
        System.out.println("O valor do imposto do livro é de R$ " + impostoL);
        System.out.println("O valor do imposto do Arroz é de R$ " + impostoA);
        System.out.println("O valor do imposto do Vestido é de R$ " + impostoV);
        System.out.println("O valor do imposto do Creme é de R$ " + impostoC);
        
    }
}
package sistemaCinema;


public class Main{
    public static void main(String[] args) {
        System.out.println("====== TESTE DE FUNCIONAMENDO SISTEMA INGRESSOS CINEMA =====\n");
        
        Ingresso ingressoM = new MeiaEntrada( 40.00 ,"Todo mundo em Pânico",true);
        System.out.println("Filme Todo mundo em Pânico (MEIA ENTRADA)");
        System.out.println("Valor completo ingresso: R$" + ingressoM.getValor());
        System.out.println("Valor do ingresso de meia entrada: R$ " + ingressoM.valorReal());
        System.out.println("\n----------------------------------------------------\n");
        
        System.out.println("===TESTE DE FUNCIONAMENTO SISTEMA INGRESSOS CINEMA =====");
        
        Ingresso ingressoFam = new IngressoFamilia(50.00, "Minions e Monsters", false,6);
        System.out.println("Filme Minions e Monsters (INGRESSO FAMILIA) ");
        System.out.println("Valor  total dos ingressos no plano familia é de: R$ " + ingressoFam.valorReal());
        System.out.println("\n----------------------------------------------------\n");
    }

}

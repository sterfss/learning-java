public class IngressoVip extends Ingresso {
    public IngressoVip(String nome, boolean ehMeia, double valor, int lote) {
        super(nome, ehMeia, valor, lote);
    }
    public double calcularReembolso() {
        if(
            ehMeia && lote == 1 ){
            return valor * 0.10;
        }else{
            return valor * 0.6;
        }
    }
}


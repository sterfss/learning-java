public class IngressoComum extends Ingresso{
    public IngressoComum(String nome, boolean ehMeia, double valor, int lote) {
        super(nome, ehMeia, valor, lote);
    }
    public double calcularReembolso() {
        if(ehMeia && lote == 1){
            return valor * 0.5;
        }else {
            return valor * 0.3;
        }
    }
}


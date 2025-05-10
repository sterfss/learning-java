public abstract class Ingresso {
    public String nome;
    public boolean ehMeia;
    public double valor;
    public int lote;

    public Ingresso(String nome, boolean ehMeia, double valor, int lote) {
        this.nome = nome;
        this.ehMeia = ehMeia;
        this.valor = valor;
        this.lote = lote;
    }
    public abstract double calcularReembolso();
}
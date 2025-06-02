package entidades;

public class Produto {
    private int idProduto;
    private String descProduto;
    private double valor;

    public Produto(int idProduto, String descProduto, double valor) {
        this.idProduto = idProduto;
        this.descProduto = descProduto;
        this.valor = valor;
    }

    public void mostrar() {
        System.out.println("ID do produto: " + idProduto);
        System.out.println("Descrição do produto: " + descProduto);
        System.out.println("Valor do produto: " + valor);
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

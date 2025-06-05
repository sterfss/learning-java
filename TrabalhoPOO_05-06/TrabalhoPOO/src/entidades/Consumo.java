package entidades;

public class Consumo {
    private int idConsumo;
    private Produto produto;
    private Reserva reserva;
    private double quantidade;
    public static final String CAMINHO_ARQUIVO = "C:\\Users\\sterf\\OneDrive\\Área de Trabalho\\estudosjava\\learning-java\\TrabalhoPOO_05-06\\TrabalhoPOO\\src\\data\\Consumo.txt";

    public Consumo(int idConsumo, Produto produto, Reserva reserva, double quantidade) {
        this.idConsumo = idConsumo;
        this.produto = produto;
        this.reserva = reserva;
        this.quantidade = quantidade;
    }

    public void mostrar() {
        System.out.println("ID consumo:" + idConsumo);
        System.out.println("Produto: " + produto);
        System.out.println("Reserva: " + reserva);
        System.out.println("Quantidade: " + quantidade);
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public Produto getProduto() {
        return produto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}

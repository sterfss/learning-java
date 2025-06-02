package entidades;

public class Quarto {
    private int idQuarto;
    private String descQuarto;

    public Quarto(int idQuarto, String descQuarto) {
        this.idQuarto = idQuarto;
        this.descQuarto = descQuarto;
    }

    public void mostrar() {
        System.out.println("ID do quarto: " + idQuarto);
        System.out.println("Descrição do quarto: " + descQuarto);
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public String getDescQuarto() {
        return descQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public void setDescQuarto(String descQuarto) {
        this.descQuarto = descQuarto;
    }
}

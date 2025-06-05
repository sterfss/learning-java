package entidades;

public class Quarto {
    private int idQuarto;
    private String descQuarto;
    public static final String CAMINHO_ARQUIVO = "C:\\Users\\sterf\\OneDrive\\Área de Trabalho\\estudosjava\\learning-java\\TrabalhoPOO_05-06\\TrabalhoPOO\\src\\data\\Quarto.txt";

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

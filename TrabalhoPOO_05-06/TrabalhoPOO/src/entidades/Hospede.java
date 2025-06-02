package entidades;

public class Hospede extends Pessoa {
    private String rg;
    private boolean fidelidade;

    public Hospede(String cpf, String nome, int idade, String rg, boolean fidelidade) {
        super(cpf, nome, idade);
        this.rg = rg;
        this.fidelidade = fidelidade;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RG: " + rg);
        System.out.println("Fidelidade: "+ (fidelidade? "Sim":"Não"));
    }

    public String getRg() {
        return rg;
    }

    public boolean getFidelidade() {
        return fidelidade;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;
    }
}
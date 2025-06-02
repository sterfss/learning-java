package entidades;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String cpf, String nome, int idade, String funcao) {
        super(cpf, nome, idade);
        this.funcao = funcao;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Função: " + funcao);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}

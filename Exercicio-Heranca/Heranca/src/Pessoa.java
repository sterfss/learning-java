public class Pessoa {
    public String cpf;
    public String nome;

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public void andar(){
        System.out.println("Andando");
    }

    public void mostrar(){
        System.out.println(this.cpf + "-" + this.nome);
    }
}
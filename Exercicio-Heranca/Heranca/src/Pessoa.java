public class Pessoa {
    public String cpf;
    public String nome;

    public void andar(){
        System.out.println("Andando");
    }

    public void mostrar(){
        System.out.println(this.cpf + "-" + this.nome);
    }
}
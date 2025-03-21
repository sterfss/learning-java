public class Ator {
    public String nome;
    public int idade;
    public int id;

    public Ator(String nome, int idade, int id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public void dadosAtor(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.id);
    }
}

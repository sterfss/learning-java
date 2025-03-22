public class Ator {
    public String nome;
    public int id;

    public Ator(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public void dadosAtor(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
    }
}

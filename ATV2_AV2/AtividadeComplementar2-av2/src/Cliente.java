public class Cliente{
    public int id;
    public String nome;
    public int anoDnasc;
    public String telefone;

    public Cliente(int id, String nome, int anoDnasc, String telefone){
        this.id = id;
        this.nome = nome;
        this.anoDnasc = anoDnasc;
        this.telefone = telefone;
    }

    public void dadosCliente(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento: " + anoDnasc);
        System.out.println("Telefone: " + telefone);
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoNascimento(){
        return anoDnasc;
    }

    public String getTelefone(){
        return telefone;
    }
}

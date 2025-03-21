
public class Genero{
    //implementação da classe gênero
    public int id;
    public String descricao;
    public boolean status;

    //construtor da classe parametrizado
    public Genero(int id, String descricao, boolean status){
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public void dadosGenero(){
        System.out.println("Gênero: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Status: "+ (status? "Ativo" : "Inativo"));
    }
}
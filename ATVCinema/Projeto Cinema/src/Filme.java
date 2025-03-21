public class Filme {
    private Genero genero;
    private int id;
    private double duracao;
    private String nome;

    public Filme(Genero genero, int id, double duracao, String nome){
        this.genero = genero;
        this.id = id;
        this.duracao = duracao;
        this.nome = nome;
    }

    public Filme(){
        this.genero = null;
        this.id = 0;
        this.duracao = 0.0;
        this.nome = "";
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Getter e Setter para o atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para o atributo duracao
    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    // Getter e Setter para o atributo faixaetaria
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dadosFilme(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Duração: " + this.duracao + " horas" );
        //System.out.println("Gênero: " + this.genero.descricao);
        this.genero.dadosGenero();
    }
}



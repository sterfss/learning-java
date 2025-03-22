public class Elenco {
    public Filme filme;
    public Ator ator;
    public boolean atorPrincipal;

    public Elenco(Filme filme, Ator ator, boolean atorPrincipal){
        this.filme = filme;
        this.ator = ator;
        this.atorPrincipal = atorPrincipal;
    }

    public void dadosElenco(){
        this.ator.dadosAtor();
        System.out.println("Ator Principal: " + (atorPrincipal? "Sim":"Não"));
    }
}

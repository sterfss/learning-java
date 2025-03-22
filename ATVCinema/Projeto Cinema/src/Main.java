public class Main {
    public static void main(String[] args) throws Exception {

        Genero g1 = new Genero(1, "Ação", true);
        Genero g2 = new Genero(2, "Comédia", true);

        Filme f1 = new Filme(g1, 1, 1.40, "Busca Implacável");
        Filme f2 = new Filme(g2, 2, 1.60, "Todo mundo em Pânico");
        
        Ator a1 = new Ator("Liam Neeson", 72, 1);
        Ator a2 = new Ator("Ana Faris", 48, 2);

        Elenco e1 = new Elenco(f1, a1, true);
        Elenco e2 = new Elenco(f2, a1, false);

        System.out.println("Informações do Filme:");
        f1.dadosFilme();
        System.out.println("");
        f2.dadosFilme();

    }
}

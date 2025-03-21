public class App {
    public static void main(String[] args) throws Exception {

        Genero g1 = new Genero(1, "Ação", true);
        Genero g2 = new Genero(2, "Comédia", true);

        Filme f1 = new Filme(g1, 1, 1.40, "Busca Implacável");
        Filme f2 = new Filme(g2, 2, 1.60, "Todo mundo em Pânico");
        
        System.out.println("Informações do filme:");
        f1.dadosFilme();
        System.out.println("");
        System.out.println("Informações do filme:");
        f2.dadosFilme();

    }
}

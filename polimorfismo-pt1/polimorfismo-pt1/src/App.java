public class App {
    public static void main(String[] args) throws Exception { 
        
        Cachorro c1 = new Cachorro("Betinho", 12, true);
        Preguica p = new Preguica("Pezinho", 14, true);
        Animal c2 = new Cachorro("carlin", 13, true);

        c1.emitirSom();
        p.emitirSom();
        c2.emitirSom();
    }
}

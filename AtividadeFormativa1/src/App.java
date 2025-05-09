import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {


         Zoologico zoo = new Zoologico();
         zoo.adicionarAnimal(new Cachorro("enzo", 13));
         zoo.adicionarAnimal(new Cachorro("enzinho", 13));
         zoo.adicionarAnimal(new Gato("caio", 10));
         zoo.adicionarAnimal(new Gato("caiao", 10));
         zoo.adicionarAnimal(new Leao("florzinha", 10));

         zoo.listarAnimais();
         zoo.emitirSons();

    }
}

public class Cachorro extends Animal implements Som{

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    public void emitirSom(){
        System.out.println("O cachorro latiu!");
    }
}

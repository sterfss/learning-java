public class Cachorro extends Animal{
    public boolean corre;

    public Cachorro(String nome, int idade, boolean corre){
        super(nome, idade);
    }
@Override
    public void emitirSom(){
        System.out.println("Latiu!");
    }
}

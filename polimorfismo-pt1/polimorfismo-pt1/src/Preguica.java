public class Preguica extends Animal{
    public boolean escala;

    public Preguica(String nome, int idade, boolean escala){
        super(nome, idade);
    }    
@Override
    public void emitirSom(){
        System.out.println("Emitiu um som baixo demais para ser ouvido");
    }
}

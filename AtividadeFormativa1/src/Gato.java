public class Gato extends Animal implements Som{

    public Gato(String nome, int idade){
        super(nome, idade);
    }

    public void emitirSom(){
        System.out.println("O gatou miou");
    }
}

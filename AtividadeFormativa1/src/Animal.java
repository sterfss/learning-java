public class Animal implements Som{
    public String nome;
    public int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
    }

    public void emitirdados(){
        System.out.println(nome);
        System.out.println(idade);
    }
}

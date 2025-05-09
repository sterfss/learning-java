import java.util.ArrayList;

public class Zoologico {
    public ArrayList<Animal> Animais;
    public int limitezoo = 10;
    
    public Zoologico(){
        this.Animais = new ArrayList<>();
    }

    public int totalAnimais(){
        return Animais.size();
    }

    public void adicionarAnimal(Animal a){
        if(Animais.size()<this.limitezoo){
            Animais.add(a);
        }else{
            System.out.println("Zoologico Lotado!!!");
        }
    }

    public void listarAnimais(){
        for (Animal animal : Animais){
            animal.emitirdados();
        }
    }

    public void emitirSons(){
        for (Animal animal : Animais){
            animal.emitirSom();
        }
    }
}


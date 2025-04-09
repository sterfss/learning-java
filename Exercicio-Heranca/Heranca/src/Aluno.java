public class Aluno extends Pessoa{
    public int matricula;
    
    public void estudar(){
        System.out.println("Estudando");
    }

    public void mostrarAluno(){
        super.mostrar();
        System.out.println(matricula);
    }
}

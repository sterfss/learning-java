public class Bolsista extends Aluno{
    public boolean isAtleta;

    public Bolsista(String nome, String cpf, int matricula, boolean isAtleta){
        super(cpf, nome, matricula);
        this.isAtleta = isAtleta;
   }
}

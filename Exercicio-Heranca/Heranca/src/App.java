public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Joao";
        aluno1.cpf = "000";
        aluno1.matricula = 1234;

        aluno1.mostrarAluno();
        aluno1.andar();
    }
}

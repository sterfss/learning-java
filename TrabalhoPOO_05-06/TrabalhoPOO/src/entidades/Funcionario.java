package entidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Funcionario extends Pessoa {
    private String funcao;
    public static final String CAMINHO_ARQUIVO = "C:\\Users\\sterf\\OneDrive\\Área de Trabalho\\estudosjava\\learning-java\\TrabalhoPOO_05-06\\TrabalhoPOO\\src\\data\\Funcionario.txt";

    public Funcionario(String cpf, String nome, int idade, String funcao) {
        super(cpf, nome, idade);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return cpf + ";" + nome + ";" + idade + ";" + funcao;
    }

    public static Funcionario fromString(String linha) {
        String[] partes = linha.split(";");
        return new Funcionario(partes[0], partes[1], Integer.parseInt(partes[2]), partes[3]);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Função: " + funcao);
    }

    public static void cadastrar(Scanner sc) throws IOException {
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.print("Função: ");
        String funcao = sc.nextLine();

        Funcionario f = new Funcionario(cpf, nome, idade, funcao);

        BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true));
        writer.write(f.toString());
        writer.newLine();
        writer.close();
        System.out.println("Funcionário cadastrado com sucesso!");

    }

    public static void listar() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO));
        String linha;
        while ((linha = reader.readLine()) != null) {
            Funcionario f = fromString(linha);
            f.mostrar();
            System.out.println("-------------------------");
        }
        reader.close();
    }

    public static void editar(Scanner sc) throws IOException {
        System.out.println("CPF do Funcionario a editar: ");
        String cpfEdit = sc.nextLine();
        ArrayList<Funcionario> lista = new ArrayList<>();
        boolean editado = false;

        BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO));
        String linha;
        while ((linha = reader.readLine()) != null) {
            Funcionario f = fromString(linha);
            if (f.getCpf().equals(cpfEdit)) {
                System.out.println("Novo nome: ");
                String nome = sc.nextLine();
                System.out.println("Nova idade: ");
                int idade = Integer.parseInt(sc.nextLine());
                System.out.println("Nova função: ");
                String funcao = sc.nextLine();
                f = new Funcionario(cpfEdit, nome, idade, funcao);
                editado = true;
            }
            lista.add(f);
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO));
        for (Funcionario f : lista) {
            writer.write(f.toString());
            writer.newLine();
        }
        writer.close();
        if (editado) {
            System.out.println("Funcionário editado com sucesso!");
        } else {
            System.out.println("CPF não encontrado.");
        }
    }
}

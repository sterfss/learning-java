package app;

import entidades.Funcionario;

import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Funcionario");
            System.out.println("2. Hospede");
            System.out.println("3. Quarto");
            System.out.println("4. Produto");
            System.out.println("5. Reserva");
            System.out.println("6. Consumo");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    menuFuncionario(sc);
                    break;
                case 2:
                    System.out.println("Menu Hospede aqui...");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
        
    }

    private static void menuFuncionario(Scanner sc) {
        int opcao;
        do {
            System.out.println("\n--- MENU FUNCIONÁRIO ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Editar");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());
            System.out.println("\n---------------------");

            try {
                switch (opcao) {
                    case 1:
                        Funcionario.cadastrar(sc);
                        break;
                    case 2:
                        Funcionario.listar();
                        break;
                    case 3:
                        Funcionario.editar(sc);
                        break;
                    case 0:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);
    }

}


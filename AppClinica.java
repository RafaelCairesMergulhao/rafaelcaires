package Veterinaria;

import java.util.Scanner;

public class AppClinica {
    private static VetPaciente cadastro = new VetPaciente(10); // Capacidade de 10 pacientes
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 – Cadastrar");
            System.out.println("2 – Consultar");
            System.out.println("3 – Imprimir Cadastro");
            System.out.println("4 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    consultarPaciente();
                    break;
                case 3:
                    imprimirCadastro();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void cadastrarPaciente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Histórico: ");
        String historico = scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, dataNascimento, historico);
        int resultado = cadastro.insere(paciente);

        if (resultado == 0) {
            System.out.println("Paciente cadastrado com sucesso!");
        } else if (resultado == -1) {
            System.out.println("Cadastro falhou: vetor cheio.");
        } else if (resultado == -2) {
            System.out.println("Cadastro falhou: paciente já cadastrado.");
        }
    }

    private static void consultarPaciente() {
        System.out.print("Digite o CPF do paciente: ");
        String cpf = scanner.nextLine();
        int posicao = cadastro.pesquisa(cpf);

        if (posicao != -1) {
            Paciente paciente = cadastro.getPaciente(posicao);
            System.out.println(paciente);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void imprimirCadastro() {
        System.out.println("Cadastro de Pacientes:");
        for (int i = 0; i < cadastro.getNElem(); i++) {
            System.out.println(cadastro.getPaciente(i));
        }
    }
}
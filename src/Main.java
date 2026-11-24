import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        int opcao;

        do {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar todas as tarefas");
            System.out.println("3. Buscar tarefa pelo código");
            System.out.println("4. Concluir tarefa");
            System.out.println("5. Listar tarefas pendentes");
            System.out.println("6. Exibir relatório");
            System.out.println("7. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1:
                    System.out.println("\n===== CADASTRAR TAREFA =====");

                    System.out.print("Código: ");
                    int codigo = lerInteiro(scanner);

                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Responsável: ");
                    String responsavel = scanner.nextLine();

                    System.out.print("Prioridade (baixa, média ou alta): ");
                    String prioridade = scanner.nextLine();

                    gerenciador.cadastrarTarefa(codigo, descricao, responsavel, prioridade);
                    break;

                case 2:
                    System.out.println("\n===== LISTA DE TAREFAS =====");
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.println("\n===== BUSCAR TAREFA =====");

                    System.out.print("Informe o código: ");
                    int codigoBusca = lerInteiro(scanner);

                    gerenciador.consultarTarefa(codigoBusca);
                    break;

                case 4:
                    System.out.println("\n===== CONCLUIR TAREFA =====");

                    System.out.print("Informe o código: ");
                    int codigoConclusao = lerInteiro(scanner);

                    gerenciador.concluirTarefa(codigoConclusao);
                    break;

                case 5:
                    System.out.println("\n===== TAREFAS PENDENTES =====");
                    gerenciador.listarPendentes();
                    break;

                case 6:
                    System.out.println("\n===== RELATÓRIO DE TAREFAS =====");
                    gerenciador.exibirRelatorio();
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 7);
    }

    public static int lerInteiro(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.println("Erro: digite um número inteiro!");
            scanner.nextLine();
            System.out.print("Tente novamente: ");
        }

        int numero = scanner.nextInt();
        scanner.nextLine();

        return numero;
    }
}


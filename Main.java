package tarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n===== Gerenciador de Tarefas =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.print("Prioridade (Baixa, Média, Alta): ");
                    String prioridade = sc.nextLine();
                    System.out.print("Data de vencimento (AAAA-MM-DD): ");
                    String dataStr = sc.nextLine();
                    LocalDate data = LocalDate.parse(dataStr);

                    tarefas.add(new Tarefa(titulo, descricao, prioridade, data));
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.println("\n--- Tarefas ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("ID: " + i);
                        tarefas.get(i).exibir();
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa a ser concluída: ");
                    int idConcluir = sc.nextInt();
                    if (idConcluir >= 0 && idConcluir < tarefas.size()) {
                        tarefas.get(idConcluir).marcarConcluida();
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("ID inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID da tarefa a ser removida: ");
                    int idRemover = sc.nextInt();
                    if (idRemover >= 0 && idRemover < tarefas.size()) {
                        tarefas.remove(idRemover);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("ID inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

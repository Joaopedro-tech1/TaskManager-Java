package tarefas;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private String prioridade; 
    private boolean concluida;
    private LocalDate dataVencimento;

    public Tarefa(String titulo, String descricao, String prioridade, LocalDate dataVencimento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.concluida = false;
    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Data de Vencimento: " + dataVencimento);
        System.out.println("Concluída: " + (concluida ? "Sim" : "Não"));
        System.out.println("---------------------------");
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public String getTitulo() {
        return titulo;
    }
}

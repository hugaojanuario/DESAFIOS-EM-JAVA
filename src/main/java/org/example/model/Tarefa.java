package org.example.model;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "*Tarefa*\n" +
                "descricao: " + descricao + "\n" +
                "concluida: " + concluida + "\n" +
                "prioridade: " + prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}

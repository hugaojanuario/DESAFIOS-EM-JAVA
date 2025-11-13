package org.example.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao, int prioridade){
        Tarefa novaTarefa = new Tarefa(descricao, prioridade);

        this.tarefas.add(novaTarefa);
        System.out.println("Tarefa Adiconada!");
    }

    public void removerTarefas ( int indice){
        if (indice >= 0 && indice < this.tarefas.size()){
            this.tarefas.remove(indice);
            System.out.println("Tarefa Removida!");

        }else{
            System.out.println("Erro: Tarefa não localizada.");
        }

    }


    public void marcarComoConcluida(int indice){
        if (indice >= 0 && indice < this.tarefas.size()){
            Tarefa marcarTarefa = this.tarefas.get(indice);

            marcarTarefa.setConcluida(true);
            System.out.println("Tarefa marcada como concluida!");
        }else {
            System.out.println("Erro: Tarefa não localizada.");
        }

    }

    public List<Tarefa> getTarefas() {
        List<Tarefa> pendentes = new ArrayList<>();

        for (Tarefa tarefaAtual : this.tarefas){
            if (!tarefaAtual.isConcluida()){
                pendentes.add(tarefaAtual);
            }

        }


        return pendentes;
    }
    public List<Tarefa> getTarefasOrdenadasPorPrioridade(){
        List<Tarefa> listaOrdenada = new ArrayList<>(this.tarefas);

        listaOrdenada.sort(Comparator.comparingInt(Tarefa::getPrioridade));

        return listaOrdenada;
    }


}

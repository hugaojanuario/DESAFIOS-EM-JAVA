package org.example.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;


    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void menu(){
        Scanner scan = new Scanner (System.in);

        while(true){
            System.out.println("""
                    **MENU**
                    escolha uma opcao: 
                    1. Adicionar.
                    2. Remover.
                    3. Concluir.
                    4. Listar.
                    5. Sair.
                    """);
            int opc = scan.nextInt();

            if (opc == 1){
                System.out.println("Informe a descricao da tarefa: ");
                String descricaoLida = scan.nextLine();
                System.out.println("Informe o nivel de prioridade: ");
                int prioridadeLida = scan.nextInt();
                adicionarTarefas(descricaoLida, prioridadeLida);

            }else if (opc == 2){
                System.out.println("Informe o indice que deseja remover: ");
                int indiceLida = scan.nextInt();
                removerTarefas(indiceLida);

            }else if (opc == 3){
            }

        }

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

package DesafiosGptGemini.CadastroDeLivros.dominio;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void menu(){
        Scanner recebeOpc = new Scanner(System.in);
        System.out.println("---MENU DE OPÇOES---");
        System.out.println("1. VER ACERVO: ");
        System.out.println("2. PEGAR EMPRESTADO: ");
        System.out.println("3. DEVOLVER: ");
        System.out.println("4. ENCERRAR APP: ");
        int opc = recebeOpc.nextInt();

        switch (opc){
            case 1: {
                exibirDetalhes();
                break;
            }
            case 2: {
                emprestar();
                break;
            }
            case 3: {
                devolver();
                break;
            }
            default:
                System.out.println("ENCERRANDO...");
                break;
        }
    }


    public void exibirDetalhes() {
        System.out.println("---DETALHES DO LIVRO---");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.anoPublicacao);
        String estadoDisponivel;
        if (disponivel == true){
            estadoDisponivel = "Sim";
        }else {
            estadoDisponivel = "Não";
        }
        System.out.println("Disponivel: " + estadoDisponivel);
        System.out.println("-----------------------");
    }

    public void emprestar() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("Livro " + this.titulo + " emprestado com sucesso.");
        } else {
            System.out.println("Livro " + this.titulo + " já emprestado.");
        }
    }

    public void devolver() {
        if (this.disponivel == false) {
            this.disponivel = true;
            System.out.println("Livro " + this.titulo + " devolvido com sucesso.");
        } else {
            System.out.println("Livro " + this.titulo + " já consta no acervo.");
        }
    }



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

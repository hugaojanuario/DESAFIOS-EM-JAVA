package DesafiosGptGemini.CadastroDeLivros.teste;


import DesafiosGptGemini.CadastroDeLivros.dominio.Livro;

public class LivroTeste01 {
    public static void main(String[] args) {
        Livro [] acervo = new Livro[3];
        for (int i = 0; i < acervo.length; i++) {
            acervo[i] = new Livro("livro hugo", "hugao", 1988);
            acervo[i] = new Livro("livro rita", "ritinha", 2002);
            acervo[i] = new Livro("livro dora", "dorinha", 2014);
        }
        for (int i = 0; i < acervo.length; i++) {
            acervo[i].menu();
        }



    }



}

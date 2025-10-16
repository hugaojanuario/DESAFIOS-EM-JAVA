package DesafiosGptGemini.MediaEscolar.teste;

import DesafiosGptGemini.MediaEscolar.dominio.Aluno;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Aluno alunos = new Aluno();

        alunos.setNome("Maria Rita");

        double [] notas = {0,0,0};
        alunos.setNotas(notas);

        alunos.calculaMedia();
        System.out.println("Aluno: " + alunos.getNome());
        System.out.println("Situação: " + alunos.getSituacao());

    }

}

package DesafiosGptGemini.MediaEscolar.dominio;

public class Aluno {
    private String nome;
    private double [] notas;
    private String situacao;

    public String getNome(){
        return this.nome;
    }
    public String getSituacao(){
        return this.situacao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSituacao(){
        this.situacao =  situacao;
    }

    public void setNotas(double [] notas){
        this.notas = notas;
    }


    public void calculaMedia(){
        double totalNotas = 0;
        for (double nota : notas) {
            totalNotas += nota;
        }


        double media = totalNotas / notas.length;

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 5.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
    }
}



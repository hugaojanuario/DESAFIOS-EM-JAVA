package DesafiosGptGemini.CadastroCarros.dominio;

public class Carro {

    private String nome;
    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.velocidadeMaxima);
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 1900 || ano > 2025) {
            System.out.println("cadastro invalidado pela informacao ano...");
        } else {
            this.ano = ano;
        }
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Getters
    public String getNome(){

        return this.nome;
    }
    public String getModelo(){

        return this.modelo;
    }
    public int getAno(){
       return this.ano;
    }
    public double getVelocidadeMaxima(){

        return this.velocidadeMaxima;
    }

}

package br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precoBase;

    public void exibirInfo(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Preco Base: "+this.precoBase);

    }

    public double calcularValorFInal(){
        return precoBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setMarca(){
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
}

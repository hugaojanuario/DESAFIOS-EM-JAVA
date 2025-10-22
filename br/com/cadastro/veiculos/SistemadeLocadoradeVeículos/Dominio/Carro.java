package br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void exibirCarro(){
        System.out.println("---DETALHES CARRO---");
        exibirInfo();
        System.out.println("Valor apos a taxa de 5%: "+calcularValorFInal());
        System.out.println("Portas: " + qtdPortas);
    }

    @Override
    public double calcularValorFInal() {
        double taxaAdm;
        double valorFinal;
        taxaAdm = (getPrecoBase() / 100 ) * 5;
        valorFinal = getPrecoBase() + taxaAdm;
        return valorFinal;
    }




    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}

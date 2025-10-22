package br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio;

public class Caminhao extends Veiculo{
    private int capacidadeCargaKg;

    public Caminhao(int capacidadeCarga) {
        this.capacidadeCargaKg = capacidadeCarga;
    }

    public void exibirCaminhao(){
        exibirInfo();
        System.out.println("Capacidade em KG da Carga: "+this.capacidadeCargaKg);
        System.out.println("Valor apos a taxa de 10%: "+calcularValorFInal());
    }

    @Override
    public double calcularValorFInal() {
        double valorFinal = 0;
        double taxaAdm;
        if(capacidadeCargaKg > 10000){
            taxaAdm = (getPrecoBase() / 100 ) * 3;
            valorFinal = getPrecoBase() + taxaAdm;
        }else{
            System.out.println("Valor Final: "+getPrecoBase());
        }
        return valorFinal;
    }

    public int getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(int capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }
}

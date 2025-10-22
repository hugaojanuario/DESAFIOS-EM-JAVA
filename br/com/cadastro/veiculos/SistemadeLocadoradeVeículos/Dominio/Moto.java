package br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void exibirMoto(){
        System.out.println("---DETALHES MOTO---");
        exibirInfo();
        System.out.println("Cilindradas: "+ this.cilindrada);
        System.out.println("Valor apos a taxa de 3%: "+calcularValorFInal());
    }

    @Override
    public double calcularValorFInal() {
        double taxaAdm;
        double valorFinal = 0;
        if(cilindrada > 500){
            taxaAdm = (getPrecoBase() / 100 ) * 10;
            valorFinal = getPrecoBase() + taxaAdm;
        }else{
            System.out.println("Valor Final: "+getPrecoBase());
        }

        return valorFinal;
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

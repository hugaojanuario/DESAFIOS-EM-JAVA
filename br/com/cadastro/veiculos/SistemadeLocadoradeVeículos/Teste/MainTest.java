package br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Teste;

import br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio.Caminhao;
import br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio.Carro;
import br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio.Moto;

public class MainTest {
    public static void main(String[] args) {
        Carro carro = new Carro(5);
        carro.setMarca("Pegout");
        carro.setPrecoBase(89000);
        carro.setModelo("208");
        carro.setAno(2025);
        carro.calcularValorFInal();
        carro.exibirCarro();
        Moto moto = new Moto(501);
        moto.setMarca("Honda");
        moto.setModelo("CB 350");
        moto.setPrecoBase(2900);
        moto.setAno(2009);
        moto.calcularValorFInal();
        moto.exibirMoto();
        Caminhao caminhao = new Caminhao(5000000);
        caminhao.setMarca("Scannia");
        caminhao.setModelo("879BG");
        caminhao.setPrecoBase(890000);
        caminhao.setAno(2025);
        caminhao.calcularValorFInal();
        caminhao.exibirCaminhao();




    }

}

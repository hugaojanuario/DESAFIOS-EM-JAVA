package br.com.cadastro.veiculos.SistemadeLocadoradeVeículos.Dominio;

import java.util.Scanner;

public class Menu {

    public void mostraMenu(){
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro(1);
        Moto moto = new Moto(1);
        System.out.println("---MENU---");
        System.out.println("""
                1. Visualizar todos os qualificados:
                2. Visualizar Moto:
                3. Visualizar Carro:
                4. Visualizar Caminhão:
                """);
        int recebeOpc = scanner.nextInt();

        switch (recebeOpc){
            case 1: {
                carro.calcularValorFInal();
                carro.exibirCarro();

                break;
            }
            case 2: {
                System.out.println("---MOTO---");
                moto.calcularValorFInal();
                moto.exibirMoto();
            }

        }

    }


}

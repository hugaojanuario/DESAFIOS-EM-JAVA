package DesafiosGptGemini.CadastroCarros.teste;


import DesafiosGptGemini.CadastroCarros.dominio.Carro;

import java.util.Scanner;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro [] garagem = new Carro [3];
        Scanner recebeCarros =  new Scanner (System.in);

        Carro carro1 = new Carro();
        System.out.println("***Informaçoes do primeiro carro***");
        System.out.println("Nome: ");
        carro1.setNome(recebeCarros.nextLine());
        System.out.println("Modelo: ");
        carro1.setModelo(recebeCarros.nextLine());
        System.out.println("Ano: ");
        carro1.setAno(recebeCarros.nextInt());
        System.out.println("Velocidade Maxima: ");
        carro1.setVelocidadeMaxima(recebeCarros.nextDouble());

        Carro carro2 = new Carro();
        carro2.setNome(recebeCarros.nextLine());
        carro2.setModelo(recebeCarros.nextLine());
        carro2.setAno(recebeCarros.nextInt());
        carro2.setVelocidadeMaxima(recebeCarros.nextDouble());

        Carro carro3 = new Carro();
        carro3.setNome(recebeCarros.nextLine());
        carro3.setModelo(recebeCarros.nextLine());
        carro3.setAno(recebeCarros.nextInt());
        carro3.setVelocidadeMaxima(recebeCarros.nextDouble());

        garagem[0] = carro1;
        garagem[1] = carro2;
        garagem[2] = carro3;

        for (Carro c : garagem){
            c.imprime();
            System.out.println("--------------\n");
        }


    }
}

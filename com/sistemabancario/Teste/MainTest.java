package br.com.sistemabancario.Teste;

import br.com.sistemabancario.Dominio.ContaBancaria;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("rita",678,1000);

        conta.menu();

    }

}

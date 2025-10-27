package br.com.sistemabancario.Dominio;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
        } else if (valorSaque > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public void menu() {
        Scanner scanMenu = new Scanner(System.in);
        int recebeOpc;

        do {
            System.out.println("---MENU---");
            System.out.println("""
                SELECIONE O QUE DESEJA:
                1 - Depositar
                2 - Sacar
                3 - Ver dados da conta
                0 - Sair
                """);

            System.out.print("Opção: ");
            recebeOpc = scanMenu.nextInt();

            switch (recebeOpc) {
                case 1 -> {
                    System.out.print("Digite o valor para depositar: ");
                    double valorDep = scanMenu.nextDouble();
                    this.depositar(valorDep);
                }
                case 2 -> {
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaq = scanMenu.nextDouble();
                    this.sacar(valorSaq);
                }
                case 3 -> this.exibirDados();
                case 0 -> System.out.println("Finalizando app...");
                default -> System.out.println("Opção inválida, tente novamente!");
            }

            System.out.println();
        } while (recebeOpc != 0);
    }
}
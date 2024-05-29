package br.edu.up.exemploLog.models;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.printf("##  Extrato  ##");
        System.out.println("Saldo poupança: " + this.getSaldo());
    }
}

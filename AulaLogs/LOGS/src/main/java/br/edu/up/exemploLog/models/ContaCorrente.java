package br.edu.up.exemploLog.models;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ContaCorrente extends Conta {
    public void imprimirExtrato() {
        System.out.printf("##  Extrato  ##");
        System.out.println("Saldo poupança: " + this.getSaldo());
    }
}

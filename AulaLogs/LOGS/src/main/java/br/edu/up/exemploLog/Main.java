package br.edu.up.exemploLog;

import br.edu.up.exemploLog.Funcionarios.Funcionario;
import br.edu.up.exemploLog.Funcionarios.Gerente;
import br.edu.up.exemploLog.Funcionarios.Programador;
import br.edu.up.exemploLog.models.Conta;
import br.edu.up.exemploLog.models.ContaCorrente;
import br.edu.up.exemploLog.models.ContaPoupanca;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario programador = new Programador();

        gerente.setSalario(2000.00);
        programador.setSalario(2000.00);

        gerente.aumentarSalario();
        programador.aumentarSalario();


//        logger.info("Criando os objetos do tipo conta: ");
//        Conta c1 = new ContaCorrente();
//        Conta c2 = new ContaPoupanca();
//
//        logger.info("Atribuindo valores para os objetos do tipo conta: +");
//        c1.setSaldo(1000.00);
//        c2.setSaldo(500.00);
//
//        c1.imprimirExtrato();
//        c2.imprimirExtrato();
    }
}
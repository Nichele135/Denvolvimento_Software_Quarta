package br.edu.up.exemploLog.Funcionarios;

public class Gerente extends Funcionario{

    @Override
    public void aumentarSalario() {
        double calculo = getSalario() + (getSalario() * 0.1);

        System.out.println("Aumentando salario: " + calculo);
    }
}

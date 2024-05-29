package br.edu.up.exemploLog.Funcionarios;

public class Programador extends Funcionario{

    @Override
    public void aumentarSalario() {
        double calculo = getSalario() + (getSalario() * 0.05);

        System.out.printf("Aumentando salario: " + calculo);
    }
}

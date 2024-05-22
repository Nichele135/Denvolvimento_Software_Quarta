import br.edu.up.relacoes.modelos.Aluno;
import br.edu.up.relacoes.modelos.Turma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma("Dev software");
        Turma turma2 = new Turma("banco de dados");

        //crie a lista para ela nao ficar nula;
        turma.setAlunos(new ArrayList<>());

        for (int i = 1; i <= 5; i++) {
        Aluno aluno = new Aluno("Aluno" + i);
        aluno.setTurma(turma);

            System.out.println(aluno.toString());


        if (i == 2){
            var aux = turma2.addAluno(aluno);
            continue;
        }

        turma.addAluno(aluno);

        }

        System.out.println(turma.getAlunos().size());

    }
}
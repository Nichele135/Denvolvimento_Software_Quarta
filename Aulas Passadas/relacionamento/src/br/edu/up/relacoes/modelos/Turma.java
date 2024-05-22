package br.edu.up.relacoes.modelos;

import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public boolean addAluno(Aluno aluno){
        if (aluno.getTurma().getNome() != this.nome){
            return false;
        }

        this.alunos.add(aluno);
        return true;
    }

}

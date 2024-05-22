package br.edu.up.collections.modelos;

import java.util.Comparator;
import java.util.UUID;

public class Alunos implements Comparable<Alunos> {
    private UUID uuid;

    private String nome;
    private Integer anoNascimento;

    public Alunos(String nome, Integer anoNascimento){
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public Alunos(UUID uuid, String nome, Integer anoNascimento) {
        this.uuid = uuid;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }



    //aqui abaixo serao os get e set;


    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Alunos aluno) {
        int idx = this.nome.compareTo(aluno.getNome());
        if (idx != 0){
            return idx;
        }
        return this.anoNascimento.compareTo(aluno.getAnoNascimento());
    }
}



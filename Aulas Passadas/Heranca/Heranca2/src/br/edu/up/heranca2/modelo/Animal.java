package br.edu.up.heranca2.modelo;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void emitirSom(){
        System.out.println("Animal rmitindo som");
    }
}

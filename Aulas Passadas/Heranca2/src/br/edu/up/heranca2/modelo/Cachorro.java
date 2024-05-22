package br.edu.up.heranca2.modelo;

public class Cachorro extends Animal {
    public Cachorro(String name) {
        super(name);
    }

    @Override
    public void emitirSom(){
        System.out.println("Gato miando");
    }
}

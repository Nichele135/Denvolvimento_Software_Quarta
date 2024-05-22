package br.edu.up.heranca2.modelo;

public class Gato extends Animal{
    public Gato(String name) {
        super(name);
    }

    public void emitirSom(){
        System.out.println("Cachorro latindo");
    }
}

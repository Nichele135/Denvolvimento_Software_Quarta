package br.edu.up.heranca2;

import br.edu.up.heranca2.modelo.Animal;
import br.edu.up.heranca2.modelo.Cachorro;
import br.edu.up.heranca2.modelo.Gato;

public class PricipalAnimal {
    public static void main(String[] args) {
        Animal gato = new Gato("Bichano");
        Animal cachorro = new Cachorro("Pingo");

        gato.emitirSom();
        cachorro.emitirSom();
    }}

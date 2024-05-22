package br.edu.up.heranca2;

import br.edu.up.heranca2.animais.*;

public class PrincipalCat {
    public static void main(String[] args) {
        Dolittle dolittle = new Dolittle();

        Cat lion = new Lion();
        Cat tiger = new Tiger();
        Cat cheetah = new Cheetah();

        dolittle.health(lion);
        dolittle.health(tiger);
        dolittle.health(cheetah);
    }
}

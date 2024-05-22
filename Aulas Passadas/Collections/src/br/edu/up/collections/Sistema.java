package br.edu.up.collections;

import br.edu.up.collections.modelos.Book;

import java.util.UUID;

public class Sistema {
    public static void main(String[] args) {
        Book<String> book1 = new Book<>("12", "Java");
        Book<Integer> book2 = new Book<>(1, "Java");
        Book<UUID> book3 = new Book<>(UUID.randomUUID(), "Java");

        System.out.println("Chave: " + book1.getChave());
        System.out.println("Chave: " + book2.getChave());
        System.out.println("Chave: " + book3.getChave());
    }
}

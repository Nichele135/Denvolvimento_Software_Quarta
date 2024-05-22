package br.edu.up.collections;

import br.edu.up.collections.modelos.Alunos;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Set<Alunos> set = new HashSet<>();
        List<Alunos> list = new ArrayList<>();

        set.add(new Alunos("Ana", 1999));
        set.add(new Alunos("Ana", 2000));

        list.add(new Alunos("Ana", 1990));
        list.add(new Alunos("Ana", 2005));

        Collections.sort(list);

        for (Alunos alunos : set){
            System.out.println(alunos.getUuid());
            System.out.println(alunos.getNome());
        }

        for (Alunos alunos : list){
            System.out.println(alunos.getUuid());
            System.out.println(alunos.getNome());
        }













//        List<String> list = new ArrayList<String>();
//        Set<Integer> set = new HashSet<>();
//        Map<Integer, String> map = new HashMap<>();
//
//
//
//        map.put(1, "Joaquim");
//        map.put(2, "Maria");
//        map.put(3, "Ana");
//        map.put(4, "Ana");
//
//        System.out.println(map.get(2));

        //Collections é um metodo util, esse sort serve para ordenar a lista,
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });

//        list.add("Joaquim");
//        list.add("Maria");
//        list.add("Ana");

        //reverse serve para inverter a lista
        //Collections.reverse(list);



//        adicionei os numeros e o set organiza em ordem natural.
//        set.add(5);
//        set.add(4);
//        set.add(3);

//
//        for (String value : list) {
//            System.out.println(value);
//        }


    }
}

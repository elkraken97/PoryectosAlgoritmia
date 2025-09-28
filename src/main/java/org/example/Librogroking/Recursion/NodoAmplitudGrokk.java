package org.example.Librogroking.Recursion;

import java.util.*;

public class NodoAmplitudGrokk {

    //Implimentacion de acuerdo al libro grokking algoritms


    static class Person{

        public String nombre;
        public boolean mangoS;


        public Person(String nombre, boolean mangoS) {
            this.nombre = nombre;
            this.mangoS = mangoS;
        }
    }


    public static void main(String[] args) {


        Map<String , List<Person>> amigos = new HashMap<>();

        amigos.put("yo",List.of(new Person("Alice",false),
                new Person("Bob",false),new Person("Claire",false)));
        Person peggy = new Person("Peggy",false);
        amigos.put("Bob",List.of(peggy,new Person("Anuj",false)));
        amigos.put("Alice",List.of(peggy));
        amigos.put("Claire",List.of(new Person("Jhonny",false),new Person("Thom",true)));
        amigos.put("Peggy",List.of());
        amigos.put("Anuj",List.of());
        amigos.put("thom",List.of());
        amigos.put("Jhonny",List.of());

        Queue<Person> personas = new ArrayDeque<>(amigos.get("yo"));
        Set<String > salidos = new HashSet<>();
        while (!personas.isEmpty()){

            Person actual = personas.poll();

            if (actual.mangoS){
                System.out.println("Vendedor encontrado");
                System.out.println(actual.nombre);
                return;
            }
            else if(!salidos.contains(actual.nombre)){
                personas.addAll(amigos.get(actual.nombre));
                salidos.add(actual.nombre);
            }



        }

    }


}

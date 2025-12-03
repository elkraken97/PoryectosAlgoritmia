package org.example.Librogroking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elaula {

    public static void main(String[] args) {



        List<Clase> cl = new ArrayList<>(List.of(new Clase("artes",9,10),
                new Clase("ingles",9.5f,10.5f),
                new Clase("matematicas",10f,11f),
                new Clase("cs",10.5f,11.5f),
                new Clase("musica",11,12)
                ));

        cl.forEach(System.out::println);
        List<Clase> horario = new ArrayList<>();
        float i = cl.getFirst().getInicio();
        float f = cl.getFirst().getFin();
        horario.add(cl.getFirst());

        for (Clase clase : cl) {
        if(clase.getInicio()>=f) {
            horario.add(clase);
            f = clase.getFin();
        }


        }

        System.out.println("Horario Optimo:");

        horario.forEach(System.out::println);

    }


    private static class Clase{

        private String nombre;
        private float inicio;
        private float fin;

        public Clase(String nombre, float inicio, float fin) {
            this.nombre = nombre;
            this.inicio = inicio;
            this.fin = fin;
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getInicio() {
            return inicio;
        }

        public void setInicio(float inicio) {
            this.inicio = inicio;
        }

        public float getFin() {
            return fin;
        }

        public void setFin(float fin) {
            this.fin = fin;
        }

        @Override
        public String toString() {
            return "Clase{" +
                    "nombre='" + nombre + '\'' +
                    ", inicio=" + inicio +
                    ", fin=" + fin +
                    '}';
        }
    }

}

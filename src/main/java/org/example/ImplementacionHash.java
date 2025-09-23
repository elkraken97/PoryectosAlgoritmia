package org.example;

public class ImplementacionHash {


    public static void main(String[] args) {

        String[][] nombres = new String[31][10];


        String[] names = {
                "Ana", "Luis", "Marcela", "José", "Ximena", "Carlos", "Beatriz", "Raúl", "Sofía", "Daniel",
                "Elena", "Fernando", "Gabriela", "Héctor", "Isabel", "Jorge", "Karen", "Laura", "Miguel", "Natalia",
                "Oscar", "Patricia", "Quetzal", "Rosa", "Samuel", "Teresa", "Ulises", "Valeria", "Wendy", "Xavier",
                "Yolanda"
        };

        for (String name : names) {
            guardarNombre(name,nombres);
        }


        for (String[] nombre : nombres) {

            if (nombre[0] == null) {

                continue;
            }


            int it = 0;
            while (nombre[it] != null) {
                System.out.println("Nombre: " + nombre[it] + "  " +(it>0?"--Colision!":"") + it);
                it++;
            }


        }



    }

    private static void guardarNombre(String nombre, String[][] nombres) {

            int indice = generarIndiceHash(nombre,nombres.length);

            if(nombres[indice][0]!=null){
                int it = 0;
               while(nombres[indice][it]!=null){

                   it++;

               }

               nombres[indice][it]=nombre;


            }

            nombres[indice][0] = nombre;

    }

    private static int generarIndiceHash(String nombre, int length) {
       nombre = nombre.toLowerCase();
        int indice = 0;


        for (int j = 0; j < nombre.length(); j++) {


            indice = 31 * indice + obtenerPosicionDeLetra(nombre.charAt(j));

        }


        return Math.abs(indice%length);


    }

    private static int obtenerPosicionDeLetra(Character c) {

        return c - 'a' + 1 ;



    }


}

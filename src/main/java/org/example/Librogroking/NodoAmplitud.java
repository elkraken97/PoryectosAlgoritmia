package org.example.Librogroking;

import java.util.*;

public class NodoAmplitud {

//Implementacion a mi creencia
    static class Nodo{

        public Nodo izquierdo;
        public Nodo derecho;
        public boolean meta;
        public String nm;
        public Nodo(boolean esM,String nombre) {
            this.meta= esM;
            this.nm = nombre;
        }



        public boolean isMeta() {
            return meta;
        }

    }


    public static void main(String[] args) {



        Nodo inicio = new Nodo(false,"inicio");
        Nodo nodo2 = new Nodo(false,"nodo 2");
        Nodo nodo3 = new Nodo(false,"nodo 3");
        inicio.izquierdo = nodo2;
        inicio.derecho = nodo3;

        nodo2.derecho= new Nodo(false,"nodo4");

        nodo3.izquierdo = new Nodo(false,"nodo 5 ");


        nodo2.izquierdo = new Nodo(true,"nodo 6 (meta)");



        busquedaMasCorta(inicio);


    }

    private static void busquedaMasCorta(Nodo inicio) {


        Queue<Nodo> nodos = new ArrayDeque<>();
        Map<Nodo,Nodo> camino = new HashMap<>();
        nodos.add(inicio);
        camino.put(inicio,null);

        while (!nodos.isEmpty()){

         Nodo actual = nodos.poll();


         if(actual.isMeta()){


             System.out.println("Meta encontrada");
                imprimirCamino(camino,actual);
            return;
         }



         if(actual.izquierdo!=null&& !camino.containsKey(actual.izquierdo)){

             camino.put(actual.izquierdo,actual);
             nodos.add(actual.izquierdo);

         }


         if(actual.derecho != null && !camino.containsKey(actual.derecho)){


            camino.put(actual.derecho,actual);
            nodos.add(actual.derecho);

         }



        }




    }


    public static void imprimirCamino(Map<Nodo,Nodo> padres,Nodo meta){

        List<Nodo> camino = new ArrayList<>();
        Nodo ac = meta;
        while (ac != null){


            camino.add(ac);
            ac = padres.get(ac);
        }
        Collections.reverse(camino);
        for (Nodo nodo : camino) {
            System.out.println(nodo.nm+"->");
        }




    }

}

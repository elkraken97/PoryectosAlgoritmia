package org.example.Librogroking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {


    public static void main(String[] args) {


        List<Integer> desordenado = new ArrayList<>(List.of(    42, -7, 13, 0, 99, 23, 42, -15, 8, 77,
                5, 5, 1024, -512, 3, 88, 17, 6, 6, 6,
                2048, 1, -1, 999, 100, 50, 33, 12, 11, 10,
                9, 8, 7, 6, 5, 4, 3, 2, 1, 0,
                -100, -200, 300, 400, 500, 600, 700, 800, 900, 1000

        ));
        int ml = 1;



        for (Integer i : desordenado) {

            System.out.print(i+",");
            System.out.print(ml%10==0?"\n":"");
            ml++;
        }

        System.out.println();
        long a  = System.nanoTime();

        List<Integer> ordenado = ordenacionQuick(desordenado);
        long l = System.nanoTime();

        System.out.println(l-a);

        ml = 1;
        for (Integer i : ordenado) {
            System.out.print(i+",");
            System.out.print(ml%10==0?"\n":"");
            ml++;
        }

    }


    public static List<Integer> ordenacionQuick(List<Integer> arreglo){


        if(arreglo.size()<2){
            return arreglo;
        }


        int pivote = arreglo.removeFirst();

        List<Integer> menor = new ArrayList<>();
        List<Integer> mayor = new ArrayList<>();

        for (Integer i : arreglo) {

            if(i<pivote){
                menor.add(i);
            }else{
                mayor.add(i);
            }
        }


        List<Integer> resultado = new ArrayList<>(ordenacionQuick(menor));
        resultado.add(pivote);
        resultado.addAll(ordenacionQuick(mayor));


        return resultado;

    }



}

package org.example.Librogroking;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {



        List<Integer> array = new ArrayList<>(List.of(3122,123,12312,4,67563,3537,3233,87,96734,2142365,1242356,7654));
        array.forEach(System.out::println);
        System.out.println();
        List<Integer> ordenado = ordenarSelection(array);
        ordenado.forEach(System.out::println);
        
        
        
        
    }

    private static List<Integer> ordenarSelection(List<Integer>  array) {
        List<Integer> ordenado = new ArrayList<>();
        int tamano = array.size();
        for (int i = 0; i < tamano; i++) {
            int small = encontrarMinimo(array);
            ordenado.add(array.remove(small));
        }
        
        return ordenado;
        
    }

    private static int encontrarMinimo(List<Integer>  array) {
        int minimo = array.getFirst();
        int indiceMinimo = 0;
        for (int i = 1; i < array.size(); i++) {
                if(minimo>array.get(i)){
                    minimo = array.get(i);
                    indiceMinimo = i;
                }
        }
        return indiceMinimo;
    }


}

package org.example.Librogroking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SumaRecursiva {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(12, 47, 3, 89, 56, 23, 78, 14, 65, 34, 91, 7, 52, 18, 40, 73, 29, 66, 11, 84));
        int suma =  sumaR(lista,0);
        System.out.println(suma);

    }

    private static int sumaR(List<Integer> integers,int indice) {

        if (indice>=integers.size()){
            return 0;
        }

        return integers.get(indice) + sumaR(integers,indice+1);
    }
}

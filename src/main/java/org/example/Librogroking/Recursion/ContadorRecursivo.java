package org.example.Librogroking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ContadorRecursivo {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(List.of(12, 47, 3, 89, 56, 23, 78, 14, 65, 34, 91, 7, 52, 18, 40, 73, 29, 66, 11, 84));
        System.out.println(lista.size());
        int c = contadorR(lista,0);
        System.out.println(c);
    }

    private static int contadorR(List<Integer> lista,int posicion) {

        try{
            int valor = lista.get(posicion);

            return 1+contadorR(lista,posicion+1);
        }catch (Exception e){
            return 0;
        }
    }

}


package org.example.Librogroking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MaximoRecursivo {


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(12, 47, 3, 89, 56, 23, 78, 14, 65, 34, 91, 7, 52, 18, 40, 73, 29, 66, 11, 84,234325235));

        int indx = recusionMasGrande(lista,0,0);
        System.out.println(lista.get(indx));

    }

    private static int recusionMasGrande(List<Integer> lista,int posicion,int posicionDevalorMasGrande) {


        if (posicion>=lista.size()){
            return posicionDevalorMasGrande;
        }

        if (lista.get(posicion)>lista.get(posicionDevalorMasGrande)) {
            return recusionMasGrande(lista,posicion+1,posicion);
        }


        return recusionMasGrande(lista,posicion+1,posicionDevalorMasGrande);
    }


}

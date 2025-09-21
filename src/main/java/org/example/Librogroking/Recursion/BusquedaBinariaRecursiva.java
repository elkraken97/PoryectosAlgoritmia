package org.example.Librogroking.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusquedaBinariaRecursiva {
    public static void main(String[] args) {
        int[] arregloOrdenado = {3, 8, 15, 23, 30, 42, 56, 78, 91};
        int buscar = 78;

      int pos =   buscarRecursivo(arregloOrdenado,0,arregloOrdenado.length-1,buscar);
        System.out.println(pos);
        System.out.println(arregloOrdenado[pos]);

    }

    private static int buscarRecursivo(int[] arregloOrdenado,int abajo,int arriba,int buscar) {

        int medio = (abajo+arriba)/2;

        if(arregloOrdenado[medio]==buscar){
            return medio;
        }

        if(arregloOrdenado[medio]<buscar){
            return buscarRecursivo(arregloOrdenado,medio+1,arriba,buscar);
        }



        return buscarRecursivo(arregloOrdenado,abajo,medio-1,buscar);


    }
}

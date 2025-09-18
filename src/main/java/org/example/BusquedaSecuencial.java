package org.example;

import java.util.Scanner;

public class BusquedaSecuencial {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arreglo = new int[10];

        llenarArreglo(arreglo);
        System.out.println("Ingrese el numero a buscar");
        int numeroBuscado = pedirNumero();

        buscarNumero(arreglo,numeroBuscado);

    }
    private static void buscarNumero(int[] arreglo, int numeroBuscado) {

        for (int i = 0; i < arreglo.length; i++) {
            if (numeroBuscado == arreglo[i]){
                System.out.println("El numero " + numeroBuscado + " esta en la posicion " + i);
                System.out.println("Comparaciones necesarias: "+ (i+1));
                return;
            }
        }

        System.out.println("EL numero buscado ("+numeroBuscado+") no existe");
        System.out.println("Comparaciones necesarias: "+ (arreglo.length+1));


    }
    private static void llenarArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero " + (i+1));
            arreglo[i] = pedirNumero();

        }

    }

    private static int pedirNumero(){
        while (true){
            try {
                 return sc.nextInt();
             } catch (Exception e) {
                 System.out.println("Debe ingresar un numero");
             }
        }
    }

}

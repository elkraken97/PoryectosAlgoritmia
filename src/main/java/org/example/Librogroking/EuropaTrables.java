package org.example.Librogroking;

import java.util.ArrayList;
import java.util.List;

public class EuropaTrables {

    public static void main(String[] args) {


        int horasTotales = 56;


        List<Articulo> articulos = new ArrayList<>(List.of(new Articulo("Torre Eiffel (París)", 7, 10),
                new Articulo("Museo del Louvre (París)", 10, 14),
                new Articulo("Catedral de Notre Dame (París)", 1, 6),
                new Articulo("Big Ben (Londres)", 11, 7),
                new Articulo("Museo Británico (Londres)", 80000, 11),
                new Articulo("Coliseo (Roma)", 4, 13),
                new Articulo("Fontana di Trevi (Roma)", 9, 5),
                new Articulo("Vaticano (Roma)", 6, 15),
                new Articulo("Muro de Berlín", 4, 8),
                new Articulo("Paseo en canal (Ámsterdam)", 7, 9),
                new Articulo("Sagrada Familia (Barcelona)", 10, 12),
                new Articulo("Parque Güell (Barcelona)", 10, 7)));
             
        
        
        List<Articulo> articulosOrdenados = quick(articulos);


        articulosOrdenados.forEach(System.out::println);

        List<Articulo> articulosOptimos = new ArrayList<>();

        int suma = 0;

        for (Articulo articulo : articulosOrdenados) {
            suma += articulo.tiempoGastado;
            if(suma<horasTotales){
                articulosOptimos.add(articulo);
                continue;
            }
            suma-=articulo.tiempoGastado;


        }


        System.out.println("Forma optima:");
        articulosOptimos.forEach(System.out::println);

    }

    private static List<Articulo> quick(List<Articulo> arreglo) {

        if(arreglo.size()<2){
            return arreglo;
        }

        Articulo pivote = arreglo.removeFirst();

        List<Articulo> menor = new ArrayList<>();
        List<Articulo> mayor = new ArrayList<>();

        for (Articulo i : arreglo) {

            if(i.puntos>pivote.puntos){
                menor.add(i);
            }else{
                mayor.add(i);
            }
        }


        List<Articulo> resultado = new ArrayList<>(quick(menor));
        resultado.add(pivote);
        resultado.addAll(quick(mayor));


        return resultado;

    }

    private record Articulo(String lugar, int tiempoGastado, int puntos) {

        @Override
        public String toString() {
            return "Articulo:\n" +
                    "  Lugar: " + lugar + "\n" +
                    "  Tiempo gastado: " + tiempoGastado + " horas\n" +
                    "  Puntos: " + puntos + "\n";
        }

    }

}

package org.example.Librogroking;

import java.util.*;

public class CoberturaSet {

    public static void main(String[] args) {

        Set<String> estaciones = new HashSet<>(Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));



        Map<String, Set<String>> stations = new LinkedHashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        Set<String> estaciones_finales = new LinkedHashSet<>();


            while(!estaciones.isEmpty()) {

              String  mejorEstacion = null;
                Set<String> estacion_revisadas = Collections.emptySet();
                for (Map.Entry<String, Set<String>> entry : stations.entrySet()) {

                    Set<String> covered = new HashSet<>(estaciones);
                    covered.retainAll(entry.getValue());

                    if (covered.size() > estacion_revisadas.size()) {
                        mejorEstacion = entry.getKey();
                        estacion_revisadas = new HashSet<>(covered);
                    }

                }
                estaciones.removeAll(estacion_revisadas);


                estaciones_finales.add(mejorEstacion);

            }
        System.out.println("Estaciones seleccionadas: " +estaciones_finales);

    }

}

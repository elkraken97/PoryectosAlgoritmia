package org.example.Librogroking;

import java.util.*;

public class CoberturaSet2 {
    public static void main(String[] args) {
        // Estados que necesitamos cubrir
        Set<String> statesNeeded = new HashSet<>(Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

        // Usa LinkedHashMap para iterar en el orden de inserción
        Map<String, Set<String>> stations = new LinkedHashMap<>();
        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        // Para ver el orden, opcional: imprime estaciones
        // System.out.println(stations.keySet());

        Set<String> finalStations = new LinkedHashSet<>(); // mantiene orden de selección

        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = Collections.emptySet();

            for (Map.Entry<String, Set<String>> entry : stations.entrySet()) {
                String station = entry.getKey();
                Set<String> statesForStation = entry.getValue();

                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(statesForStation);

                // Mayor cobertura estricta: mantiene la primera estación en caso de empate
                if (covered.size() > statesCovered.size()) {
                    bestStation = station;
                    statesCovered = covered;
                }
            }

            if (bestStation == null || statesCovered.isEmpty()) {
                throw new IllegalStateException("No se puede cubrir más estados. Revisa datos de entrada.");
            }

            // Restar los estados ya cubiertos y agregar la mejor estación
            statesNeeded.removeAll(statesCovered);
            finalStations.add(bestStation);
        }

        System.out.println("Estaciones seleccionadas: " + finalStations);
    }
}



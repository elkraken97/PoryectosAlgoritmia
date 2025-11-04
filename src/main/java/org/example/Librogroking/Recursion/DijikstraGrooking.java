package org.example.Librogroking.Recursion;

import java.util.HashMap;
import java.util.Map;

public class DijikstraGrooking {


    public static void main(String[] args) {

         Map<String, Map<String,Integer>> grafo = new HashMap<>();
         Map<String,Integer> costos = new HashMap<>();
         Map<String,String> padres = new HashMap<>();
//
//         grafo.put("Inicio",Map.ofEntries(
//
//            Map.entry("A",5),
//            Map.entry("B",2)
//
//         ));
//
//
//         grafo.put("A",Map.ofEntries(
//
//            Map.entry("C",4),
//            Map.entry("D",2)
//
//         ));
//        grafo.put("B",Map.ofEntries(
//
//                Map.entry("A",8),
//                Map.entry("D",7)
//
//        ));
//
//        grafo.put("C",Map.ofEntries(
//                Map.entry("D",6),
//                Map.entry("Fin",3)
//        ));
//        grafo.put("D",Map.ofEntries(Map.entry("Fin",1)));
//        grafo.put("Fin",new HashMap<>());
//
//        costos.put("A",5);
//        costos.put("B",2);
//        costos.put("C",Integer.MAX_VALUE);
//        costos.put("D",Integer.MAX_VALUE);
//        costos.put("Fin",Integer.MAX_VALUE);
//
//
//        padres.put("A","Inicio");
//        padres.put("B","Inicio");
//        padres.put("C","");
//        padres.put("D","");
//        padres.put("Fin","");


        grafo.put("Inicio",new HashMap<>(){{put("A",10);}});
        grafo.put("A",new HashMap<>(){{put("B",20);}});

        grafo.put("B",Map.ofEntries(Map.entry("C",1),Map.entry("Fin",30)));
        grafo.put("C",new HashMap<>(){{put("A",1);}});
        grafo.put("Fin",new HashMap<>());

        costos.put("A",10);
        costos.put("B",Integer.MAX_VALUE);
        costos.put("C",Integer.MAX_VALUE);
        costos.put("Fin",Integer.MAX_VALUE);

        padres.put("A","Inicio");
        padres.put("B","");
        padres.put("C","");
        padres.put("Fin","");
        DijikstraModel dj = new DijikstraModel(grafo,costos,padres);


        dj.verRutaMasCorta();

    }

}

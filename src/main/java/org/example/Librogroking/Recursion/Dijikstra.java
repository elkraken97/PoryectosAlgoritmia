package org.example.Librogroking.Recursion;

import java.util.*;

public class Dijikstra {


    public static void main(String[] args) {

        Map<String, Map<String,Integer>> grafo = new HashMap<>();
        Map<String,Integer> costos = new HashMap<>();
        Map<String,String> padres = new HashMap<>();


        HashSet<String> procesados = new HashSet<>();

        grafo.put("Inicio",Map.ofEntries(
                Map.entry("A",6),
                Map.entry("B",2)
        ));


        grafo.put("A",Map.ofEntries(
                Map.entry("Fin",1)

        ));

        grafo.put("B",Map.ofEntries(
                Map.entry("A",3),
                Map.entry("Fin",5)
        ));
        grafo.put("Fin",new HashMap<>());


        padres.put("A","Inicio");
        padres.put("B","Inicio");
        padres.put("Fin","");

        costos.put("A",6);

        costos.put("B",2);

        costos.put("Fin",Integer.MAX_VALUE);


        String nodo = encontrarNodoMenorCosto(costos,procesados);

//        System.out.println(nodo);
        int costo = 0;
        Map<String,Integer> vecinos;
        while (!nodo.isEmpty()){
            costo = costos.get(nodo);
            vecinos = grafo.get(nodo);

            for (String a : vecinos.keySet()){
                int nuevoCosto = costo + vecinos.get(a);

                    if (costos.get(a)>nuevoCosto){


                        costos.put(a,nuevoCosto);
                        padres.put(a,nodo);
                    }


            }
            procesados.add(nodo);
            nodo = encontrarNodoMenorCosto(costos,procesados);



        }


        List<String> ruta = verRutaMasCorta(padres);

        System.out.println(String.join(" -> ",ruta));


            }

    private static List<String> verRutaMasCorta(Map<String, String> padres) {
    List<String> r = new ArrayList<>();
    String nodo = "Fin";


    while (nodo != null){
        r.addFirst(nodo);
        nodo = padres.get(nodo);



    }
        return r;





    }

    private static String encontrarNodoMenorCosto(Map<String, Integer> costos,HashSet<String> procesados) {
        int maxim = Integer.MAX_VALUE;
        String nodoMin = "";
        for (Map.Entry<String,Integer> entrys : costos.entrySet()){
            if (entrys.getValue()<maxim&&!procesados.contains(entrys.getKey())){
                maxim = entrys.getValue();
                nodoMin = entrys.getKey();
            }

        }


        return nodoMin;


    }


}

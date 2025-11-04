package org.example.Librogroking.Recursion;

import java.util.*;

public class DijikstraModel {



    private Map<String, Map<String,Integer>> grafo = new HashMap<>();
    private  Map<String,Integer> costos = new HashMap<>();
    private Map<String,String> padres = new HashMap<>();
    private  final HashSet<String> procesados = new HashSet<>();

    public DijikstraModel(Map<String, Map<String, Integer>> grafo, Map<String, Integer> costos, Map<String, String> padres) {
        this.grafo = grafo;
        this.costos = costos;
        this.padres = padres;
    }


    public void verRutaMasCorta(){

        procesarDijikstra();


        List<String> r = new ArrayList<>();
        String nodo = "Fin";


        while (nodo != null){
            r.addFirst(nodo);
            nodo = padres.get(nodo);



        }

        System.out.println(padres);
        System.out.println(String.join(" -> ",r));


    }



    public void procesarDijikstra(){

        String nodo = encontrarNodoMenorCosto();


        int costo = 0;

        Map<String,Integer> vecinos;


        while (!nodo.isEmpty()){
//            costo = costos.get(nodo);
            System.out.println(grafo.get(nodo));
            vecinos = grafo.get(nodo);

            for (String a : vecinos.keySet()){
                int nuevoCosto = costos.get(nodo) + vecinos.get(a);

                if (costos.get(a)>nuevoCosto){


                    costos.put(a,nuevoCosto);
                    padres.put(a,nodo);
                }


            }
            procesados.add(nodo);
            nodo = encontrarNodoMenorCosto();



        }

    }
    private String encontrarNodoMenorCosto() {
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

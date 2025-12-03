package org.example;

import java.util.*;

public class Islas {


    private static class Coordenada{
        int y;
        int x;

        public Coordenada(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x:"+x+","+"y:"+y+" ";
        }
    }


    public static void main(String[] args) {
        int[][] a = new int[10][10];


        llenarMatriz(a);

        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                System.out.print(a[i][i1]+", ");
            }
            System.out.println();
        }

        List<List<Coordenada>> islas = new ArrayList<>();
        boolean[][] visited = new boolean[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {

                if(a[i][i1]==1&&!visited[i][i1]){
                    islas.add(busquedaIsla(i,i1,visited,a));
                }

            }
        }

        System.out.println("Cantidad de islas: "+islas.size());
        System.out.println("Coordenadas de cada isla:");
        int i = 1;
        for (List<Coordenada> isla : islas) {
            System.out.println("Isla "+i+":");
            for (Coordenada coordenada : isla) {
                System.out.print(coordenada);
            }
            System.out.println();
            i++;
        }
        
    }

    private static List<Coordenada> busquedaIsla(int i, int i1, boolean[][] visited, int[][] a) {
        if (i1<0||i<0||i>9||i1>9){
            return  Collections.emptyList();
        }
        if(a[i][i1]==0||visited[i][i1]){
             return Collections.emptyList();
        }
        List<Coordenada> c = new ArrayList<>();

        c.add(new Coordenada(i,i1));
        visited[i][i1] = true;
        c.addAll(busquedaIsla(i + 1, i1, visited, a));
        c.addAll(busquedaIsla(i, i1+1, visited, a));
        c.addAll(busquedaIsla(i, i1-1, visited, a));
        c.addAll(busquedaIsla(i-1, i1, visited, a));
        return c;

    }

    private static void llenarMatriz(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Math.random() < 0.5 ? 1 : 0;
            }
        }


    }


}

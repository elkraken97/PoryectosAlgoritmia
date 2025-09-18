package org.example;

public class BusquedaSecuencialArregloOrdenado {

    public static void main(String[] args) {
        int[] arreglo = {3,7,9,10,11,20};

        int[] numeroBuscado = {1,9,22};

        for (int i : numeroBuscado) {
            buscarNumero(arreglo,i);
        }



    }
    private  static void buscarNumero(int[] arreglo, int numeroBuscado){


        int i = 0,nc =0;

        boolean encontrado = false;
        while (i < arreglo.length && !encontrado){
            if (numeroBuscado == arreglo[i]){
                encontrado = true;
            }else{
                nc++;
                if(numeroBuscado < arreglo[i]){

                    break;
                }

            }
            nc++;
            i++;
        }
        String msg = "";
        if (encontrado) {
            msg = "El numero " + numeroBuscado + " esta en la posicion " + i;

        }else{
            msg = "El numero " + numeroBuscado + " no esta en el arreglo";
        }
        msg+="\nNumero de comparaciones: "+nc;
        System.out.println(msg);


    }

}

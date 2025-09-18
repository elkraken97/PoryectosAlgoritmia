package org.example.Librogroking;

public class BusquedaBinaria {


    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int buscar = 7;

        int indice = busquedaBinaria(list,buscar);

        System.out.println(indice == -1 ? "El valor no se encuentra" : "El valor se encuentra en la posicion " + indice);

    }

    private static int busquedaBinaria(int[] list, int buscar) {
        int abajo = 0;
        int arriba = list.length-1;

        while(abajo <= arriba){

            int medio = (abajo+arriba) / 2 ;
            int valor = list[medio];
            System.out.println(arriba);
            System.out.println("Valor: " + valor + " Medio: " + medio);
            if(buscar==valor){
                return medio;
            }
            if(valor > buscar){
                arriba = medio-1;
            }else{
                abajo = medio+1;
            }

        }



        return -1;
    }


}

package org.example.Librogroking.Recursion;

import java.util.Scanner;

public class Estupida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = pedirNumeros(sc);

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero<mini){
                mini = numero;
            }
            if (numero>maxi){
                maxi = numero;
            }
        }
        int it =0;
         mini = Integer.MAX_VALUE;
         maxi = Integer.MIN_VALUE;
        while(it<numeros.length){
            if (numeros[it]<mini){
                mini = numeros[it];
            }
            if (numeros[it]>maxi){
                maxi = numeros[it];
            }
            it++;
        }
        

        it = 0;
        mini = Integer.MAX_VALUE;
        maxi = Integer.MIN_VALUE;
        do{
            if (numeros[it]<mini){
                mini = numeros[it];
            }
            if (numeros[it]>maxi){
                maxi = numeros[it];
            }
            it++;

        }while(it<numeros.length);


        System.out.println("Minimo:"+mini);
        System.out.println("Maximo:"+maxi);
    }

    private static int[] pedirNumeros(Scanner sc) {
        int[] a = new int[5];
        int i = 0;
        while(i<a.length){

            System.out.println("Ingrese el numero de la posicon "+i);
            a[i] = sc.nextInt();
            
            i++;
            
        }
        
        return a;
        
        
    }


}

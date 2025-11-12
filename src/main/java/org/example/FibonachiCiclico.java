package org.example;

import java.util.Scanner;

public class FibonachiCiclico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("INgrese la posicion de numero de fibonachi");
        int i = sc.nextInt();
        int[] secuencia = new int[i];
        secuencia[0] = 0;
        secuencia[1] = 1;
        for (int j = 2; j < i; j++) {

            secuencia[j] = secuencia[j-1] +secuencia[j-2];


        }
//
        for(int sec:secuencia){
            System.out.print(sec+" ");
        }
    }
}

package org.example;





import java.util.Scanner;
public class Fibonachi {
    public static void main(String[] args) {




             Scanner sc = new Scanner(System.in);
//             System.out.println("INgrese la posicion de numero de fibonachi");
//             int i = sc.nextInt();
//             int[] secuencia = new int[i];
//             secuencia[0] = 0;
//             secuencia[1] = 1;
//             for (int j = 2; j < i; j++) {
//
//                 secuencia[j] = secuencia[j-1] +secuencia[j-2];
//
//
//             }
////
//             for(int sec:secuencia){
//           System.out.print(sec+" ");
//             }




        System.out.println("Ingrese el numero de ola posiscionq ue quiere saber");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibona(i) + " ");
        }


    }



    public static int fibona(int n){
        if (n <= 1) {
            return n;
        }
        return fibona(n - 1) + fibona(n - 2);
    }

    public static void fib(int n,int posterior,int actual){
        if(n<0)
            return;


        System.out.println(posterior+" "+actual+" "+(posterior+actual));
        int aux = actual;
        actual = (posterior+actual);
        posterior = aux;
        n--;


        fib(n,posterior,actual);




    }

}

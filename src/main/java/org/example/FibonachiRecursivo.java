package org.example;





import java.util.Scanner;
public class FibonachiRecursivo {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);




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

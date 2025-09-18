package org.example.Librogroking.Recursion;

public class Factorial {


    public static void main(String[] args) {
        int num = factorialF(3);
        System.out.println(num);
    }

    public static int factorialF(int n){
        if(n==1){
            return 1;
        }
        return n*factorialF(n-1);
    }


}

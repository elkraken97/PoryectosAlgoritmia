package org.example;

import java.util.Scanner;

public class FactorialCiclico {
    public static void main(String[] args) {
         	  Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el numero a ver el factorial que este en un rango ");
         int num = sc.nextInt();
         int fac = 1;
        while(num>0&&num<10){
             System.out.println(num+fac);
             fac *= num;
            num--;
        }
    }
}

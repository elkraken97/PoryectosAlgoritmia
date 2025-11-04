package org.example;

public class Shell {
    public static void main(String [] args) {
        int salto, i, j, k, temp, T = 7;
        int[] A = {3, 5, 2, 1, 7, 9, 6};
        salto = T / 2;
        int intercambios = 0;
        System.out.println ("Arreglo original");
        for (i = 0; i < T; i++)
            System.out.print(A[i] + "   " );
        System.out.println();
        while (salto > 0) {
            for (i = salto; i < T; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if ( A[k] >= A[j])
                        j = -1; // Termina el ciclo, par ordenado
                    else {
                        intercambios++;
                        temp = A[j];
                        A[j] = A[k];
                        A[k] = temp;

                        j = j - salto;
                        System.out.println("\nIntercambio:Salto=("+salto+")");
                        System.out.println(A[j]+" -><- "+A[k]);
                        System.out.println();

                        imprimirArregloActual(A);

                    }
                }
            }
            salto /= 2;
        }

        System.out.println ("\n\n Arreglo ordenado\n");
        for (i = 0; i < T; i++)
            System.out.print(A[i] + "   ");

        System.out.println();
        System.out.println("Total de intercambios: "+intercambios);
    }

    private static void imprimirArregloActual(int[] a) {

        System.out.println("Arreglo actual:");

        for (int j : a) System.out.print(j + "   ");


        System.out.println();
    }
}
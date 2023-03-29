package Tarea65;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 33, 54, 73, 91};
        int x = 5;
        int pos = binarySearch(a, x);
        System.out.println( x + " esta en " + pos);
    }
}
/*
binarySearch es el que nos hace la búsqueda
Si el elemento buscado es menor que el elemento central, se descarta la mitad derecha del arreglo.
Si el elemento buscado es mayor que el elemento central, se descarta la mitad izquierda del arreglo
 */
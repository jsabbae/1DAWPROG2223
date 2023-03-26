package Tarea42;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] tablaMultiplicar = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(tablaMultiplicar[i]));
        }
    }
}

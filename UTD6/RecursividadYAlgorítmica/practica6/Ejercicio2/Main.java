package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        /*
         * Número de discos
         */
        int n = 3;
        /*
         * Vamos a nombrar las tres torres y actuarán como caracteres
         */
        torresHanoi(n, 'A', 'B', 'C');
    }

    public static void torresHanoi(int numeroDiscos, char torreOrigen, char torreAuxiliar, char torreDestino) {
        if (numeroDiscos == 1) {
            System.out.println("Mover disco 1 desde " + torreOrigen + " hasta " + torreDestino);
        } else {

            torresHanoi(numeroDiscos - 1, torreOrigen, torreDestino, torreAuxiliar);

            System.out.println("Mover disco " + numeroDiscos + " desde " + torreOrigen + " hasta " + torreDestino);

            torresHanoi(numeroDiscos - 1, torreAuxiliar, torreOrigen, torreDestino);
        }
    }
}

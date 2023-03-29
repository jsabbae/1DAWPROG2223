package practica6.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        /*
         número de discos
         */
        int n = 3;
/*
Vamos a nombrar las tres torres y acturán como caracteres
 */
        torresHanoi(n, 'A', 'B', 'C');
    }


    public static void torresHanoi(int numeroDisco, char semueveDesde, char Luegosemueve, char semueveHasta) {
        /*
        Esto podría ser el caso base
         Voy a nombrar el primer disco con la condición if, else y luego nombrará los siguientes discos
         */
        if (numeroDisco == 1) {
            System.out.println("Mover disco 1 desde " + semueveDesde + " hasta " + semueveHasta);
        } else {
            System.out.println("Mover disco " + numeroDisco + " desde " + semueveDesde + " hasta " + semueveHasta);
        }



        if (numeroDisco == 2) {
            System.out.println("Mover disco 2 desde " + semueveDesde + " hasta " + semueveHasta);
        } else {
            System.out.println("Mover disco " + numeroDisco + " desde " + semueveDesde + " hasta " + semueveHasta);
        }





    }
}

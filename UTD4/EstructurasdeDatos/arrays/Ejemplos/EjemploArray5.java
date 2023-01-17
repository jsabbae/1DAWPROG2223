package EstructurasdeDatos.arrays.Ejemplos;

public class EjemploArray5 {
    public static void main(String[] args) {
        Integer[] a = new Integer[5];
        Integer[][] b = new Integer[5][2];
        Integer[][] c = {{1,2},{4},{4,5,6}};
        b[0] = new Integer[1];
        b[0][0] = 0;
        b[1] = new Integer[2];
        b[1][0]=0;
        b[1][1]=1;
        b[2] = new Integer[3];
        b[2][0] = 0;
        b[2][1] = 1;
        b[2][2] = 2;

        System.out.println(b.length);
        System.out.println(b[0].length);
    }
}

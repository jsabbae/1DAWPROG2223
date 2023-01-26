package UTD4.Tarea45;

public class Tarea45 {
    public static void main(String[] args) {
    }

    public int[] insertarElemento(int[] arr, int elemento, int posicion) {
        int[] out = new int[arr.length + 1];
        System.arraycopy(arr, 0, out, 0, posicion);
        out[posicion] = elemento;
        System.arraycopy(arr, posicion, out, posicion + 1, arr.length - posicion);
        return out;
    }

    public int[] eliminarElemento(int[] arr, int elemento, boolean logico) {
        int[] out;
        if (logico) {
            out = arr.clone();
            for (int i = 0; i < out.length; i++) {
                if (out[i] == elemento) {
                    out[i] = 0;
                }
            }
        }
        return out;
    }
}

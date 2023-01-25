package UTD4.Tarea43;

public class operacionesArray {
    public static void main(String[] args) {
        // Crea un array con 10 números aleatorios
        int[] numeros = new int[10];
        NumeroAleat numaleat = new NuemeroAleat();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numaleat.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

            int[] a = {1,2,3,4,5,6,7,8,9,10};


        }
    }
}

package ejercicio5;

public class Ejercicio5 {
    public static int buscarPalabra(String texto, String palabra) {
        int contador = 0;
        int indice = texto.indexOf(palabra);  // Buscar la primera aparición de la palabra

        while (indice != -1) {
            contador++;
            indice = texto.indexOf(palabra, indice + 1);
        }

        return contador;
    }
}
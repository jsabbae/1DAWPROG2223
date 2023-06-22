package ejercicio5;

import static ejercicio5.Ejercicio5.buscarPalabra;

public class Main {
    public static void main(String[] args) {
        String texto = "Este es un texto de ejemplo para buscar palabras. Ejemplo de búsqueda de palabras.";
        String palabra = "ejemplo";

        int apariciones = buscarPalabra(texto, palabra);

        System.out.println("Número de apariciones de la palabra '" + palabra + "': " + apariciones);
    }
}

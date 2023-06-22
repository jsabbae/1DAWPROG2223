package ejercicio2;

import static ejercicio2.numerosPalabras.contarPalabrasDiferentes;

public class Main {
    public static void main(String[] args) {
        String texto = args[0];
        int resultado = contarPalabrasDiferentes(texto);
        System.out.println("Número de palabras diferentes: " + resultado);
    }
}

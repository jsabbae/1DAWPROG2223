package ejercicio2;

public class numerosPalabras {


    public static int contarPalabrasDiferentes(String texto) {
        String[] palabras = texto.toLowerCase().split("\\s+");  
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            boolean esDiferente = true;
            for (int j = 0; j < i; j++) {
                if (palabras[i].equals(palabras[j])) {
                    esDiferente = false;
                    break;
                }
            }
            if (esDiferente) {
                contador++;
            }
        }

        return contador;
    }

}

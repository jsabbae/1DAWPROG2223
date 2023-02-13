package UTD4.Practica4.ejercicio5;

public class Codigo {
    public static void main(String[] args) {
        String texto;
        String palabra;

        System.out.print("Escriba un texto: " + texto);
        System.out.print("Escriba la palabra en el buscador: " + palabra);


        int numero= busquedaNumero(texto, palabra);

        System.out.println("La palabra '" + palabra + "' aparece " + numero + " veces en el texto.");
    }

    private static int busquedaNumero(String texto, String palabra) {
        int count = 0;
        int index = 0;

        while (index != -1) {
            index = texto.indexOf(palabra, index);

            if (index != -1) {
                count++;
                index += palabra.length();
            }
        }

        return count;
    }
}






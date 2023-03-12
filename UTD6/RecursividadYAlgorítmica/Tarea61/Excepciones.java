package UTD6.Tarea61.Excepciones;

/*1. ¿Cuál es el nombre en Java de la clase que define las excepciones, y de la que debe
        heredar cualquier clase que queramos usar para representar una excepción?


java.lang.Exception


        2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen
        al invocar un método de un objeto cuyo valor es “null”?


NullPointerException.    Esto intentará usar una referencia  a in valor que tiene nulo.


        3. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen
        al obtener un comportamiento anómalo en la entrada / salida de información?


java.io.IOException


        4. Observa el siguiente fragmento de código:
        String [] array_string = new String [25];
        System.out.println (array_string [3].length());
        ¿Qué excepción se produciría en el mismo?


NullPointerException


        5. Observa el siguiente fragmento de código:
        String aux = “hola”;
        int aux2 = Integer.parseInt (aux);
        ¿Qué sucedería al ejecutar el mismo?


Haría un NumberFormatException


        6. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente
        acción:
        Recibe como parámetros una cadena (String) y un entero (int);
        Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length():
        int” de la clase “String”) devuelve el carácter en la posición correspondiente (puedes hacer
        uso del método “charAt(int)” de la clase “String”).
        En caso contrario, construye y lanza una excepción de tipo “Exception”.

 */



public class Excepciones {
    public static char caracterEn(String cadena, int entero) throws Exception {
        entero >= 0
        if (cadena <= entero) {
            throw new Exception();
        } else {
            return length();
        }
    }
}
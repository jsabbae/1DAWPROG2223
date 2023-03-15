package UTD6.RecursividadYAlgorítmica.Tarea63;

public class ComplejidadAlgoritmica {
    /* Ejercicio 1
    Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande.
     */
    public static void main(String[] args) {
        int[]  conjunto =  {3, 1, 8, 4, 2, 9, 5, 7, 6};
        int max = Max(conjunto);
        System.out.println("El número más grande es: " + max);
    }


    public static int Max(int[] conjunto) {
        int max = conjunto[0];
        for (int i = 1; i < conjunto.length; i++) {
            if (conjunto[i] > max) {
                max = conjunto[i];
            }
        }
        return max;
    }


  /*
            Ejercicio 2
    A continuación, analiza la complejidad del algoritmo anterior utilizando la notación big-O.




Crece proporcionalmente al tamaño del conjunto, donde n es el número de elementos en el conjunto.
   */

    /*
            Ejercicio 3
            ¿Crees que influye la cantidad de números del conjunto en el tiempo que tardará tu
    algoritmo en resolver el problema? ¿Podrías indicar cuál es el caso más favorable y el peor
    caso?

    Podría tardar más tiempo al encontrar el número más grande, que dependerá de la posición del número en el conjunto.
    El algoritmo será más rápido cuanto antes encuentre el número más grande, independientemente de su posición en el conjunto.

*/
}




package UTD6.RecursividadYAlgorítmica.Tarea62;

public class Recursividad {



    /*Ejercicio 1.
Crea una función que imprima los números naturales en orden inverso comenzando por el
número n.
Ejemplo:
Para n = 5 → 5, 4, 3, 2, 1
*/
    public static void inverso(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n);
            inverso(n-1);
        }
    }






    /*Ejercicio 2.
    Calcula la suma de los primeros n números naturales utilizando recursividad.
            Ejemplo:
    sumaNaturales(5) = 1 + 2 + 3 + 4 + 5 = 15
*/

    public static int recursividad(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recursividad(n-1);

        }


        int sumaPrimeros = recursividad(n);
        int n = 5;
        System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaPrimeros);

    }











    /*   Ejercicio 3.
Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci.
Esta sucesión se caracteriza por estar definida naturalmente de manera recursiva, pues
consiste en que cada número de la sucesión se obtiene sumando los dos enteros positivos
que le preceden, comenzando la sucesión por los números 0 y 1. Por lo tanto tendría la
siguiente forma:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34…. hasta n
Teóricamente podría definirse así:
fibonacci(0) = 0
fibonacci(1) = 1
fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
Más info: https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci

     */

    public static int fibonacci(int n) {
        int n = 6;
        int resultado = fibonacci(n);
        System.out.println("El " + n + "º término de la sucesión de Fibonacci es: " + resultado);




        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }








/* Ejercicio 4.
Crea un método que calcule el máximo común divisor (MCD) de dos números enteros
(utilizando la división euclídea).
El algoritmo que hay que implementar se conoce como algoritmo de euclides, tal vez os
suene de algo.
Como pista, este sería el algoritmo en forma iterativa en pseudocódigo:
function mcd(a,b):
mientras b <> 0 hacer:
a = b
b = a mod b
resultado = a

*/
    public static int MCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return MCD(b, a % b);
        }
        int a = 24;
        int b = 36;
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd(a, b));
    }

}

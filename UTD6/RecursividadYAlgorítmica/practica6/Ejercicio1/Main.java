package practica6.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        /*
        Aquí lanzaremos la Excepcion con el doSomething()
        El get.Message devolverá el mensaje
         */
        try {
            doSomething();
        } catch (Exception ex) {
            System.out.println("Hola " + ex.getMessage());
        }
    }

    public static void doSomething() throws primeraExcepcion, segundaExcepcion {

        throw new primeraExcepcion("Adios ");



/*
El throw new crea y lanza la excepción y se imprimirá el resultado
 */
    }

}


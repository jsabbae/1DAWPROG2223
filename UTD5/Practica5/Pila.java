package UTD5.Practica5;

public class Pila {
    private Nodo pila;

    public Pila() {
        pila = null;
    }

    //Esto representará un elemneto más mayor



    //Ahora vamos agregar un nuevo elemento a la pila (apilar)
    public void apilar(int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        pila = nuevoNodo;
    }

    public int desapilar() {
        if (esVacia()) {
            throw new RuntimeException("LNo hay nada en la pila");
        }
        int elemento = pila.elemento;
        pila = pila.siguiente;
        return elemento;
    }

    public int cima() {
        if (esVacia()) {
            throw new RuntimeException("No hay nada en la pila");
        }
        return pila.elemento;
    }

    // Aquí obtendremos el últimmo elemento que se ha añadido
    // El RuntimeException indicará si la pila está vacía y no se puede obtener ningún elemento.


    public void limpiar() {
        pila = null;
    }

    public boolean esVacia() {
        return pila == null;
    }

    public int longitud() {
        int longitud = 0;
        Nodo actual = pila;
        return longitud;
    }
}

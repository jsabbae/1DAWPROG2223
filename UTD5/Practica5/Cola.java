package UTD5.Practica5;

public class Cola {



        Nodo primero;
        Nodo ultimo;


        // Aquí seleccionaremos el nodo que ha estado en la cola por más tiempo que es el oprimero
        //El ultimo será para el que ha estado por menos tiempo.

        //Esto nos ayudará ha tener un seguimiento.

    public Cola() {
            primero = null;
            ultimo = null;
        }

        public void encolar ( int elemento){
            Nodo nuevoNodo = new Nodo(elemento);
            if (esVacia()) {
                primero = nuevoNodo;
                ultimo = nuevoNodo;
            } else {
                ultimo.siguiente = nuevoNodo;
                ultimo = nuevoNodo;
            }
        }


//Esto se utilizará para sacar el elemnto de la cola y eliminarlo
        public int desencolar () {
            if (esVacia()) {
                throw new RuntimeException("La cola está vacía");
            }

            //El throw new nos servirá para lanzar una excepción si se intenta sacar un elemento de una cola vacía

            int elemento = primero.elemento;
            primero = primero.siguiente;
            if (esVacia()) {
                ultimo = null;
            }
            return elemento;
        }

        public int frente () {
            if (esVacia()) {
                throw new RuntimeException("La cola está vacía");
            }
            return primero.elemento;
        }

        //El throw new se creará una nueva instancia  de excepción y lanzarla .
        // Indica que ha habido un error

        public Cola resto () {
            if (esVacia()) {
                throw new RuntimeException("La cola está vacía");
            }

            //El RuntimeException es aquel  que muestra el mensaje de fallo que indica que esta vacía


            Cola resto = new Cola();
            resto.primero = primero.siguiente;
            Nodo actual = primero;
            while (actual != null) {
                resto.encolar(actual.elemento);
                actual = actual.siguiente;
            }
            return resto;
        }

        public void limpiar () {
            primero = null;
            ultimo = null;
        }

        public boolean esVacia () {
            return primero == null;
        }

        public int longitud () {
            int longitud = 0;
            Nodo actual = primero;
            while (actual != null) {
                longitud++;
                actual = actual.siguiente;
            }


            return longitud;
        }
        // En esta clase se representará elementos de la cola
        //Tienne un constructor que se utiliza para crear nuevos nodos para la cola.
    }

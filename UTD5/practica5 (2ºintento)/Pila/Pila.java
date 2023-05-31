package Pila;
import java.util.Stack;

public class Pila<T> {
    private Stack<T> stack;

    public Pila() {
        stack = new Stack<>();
    }

    public void apilar(T elemento) {
        stack.push(elemento);
    }

    public T desapilar() {
        return stack.pop();
    }

    public T cima() {
        return stack.peek();
    }

    public void limpiar() {
        stack.clear();
    }

    public boolean esVacia() {
        return stack.isEmpty();
    }

    public int longitud() {
        return stack.size();
    }
}







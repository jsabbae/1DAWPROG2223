package Pila;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Pila<Integer> pila = new Pila();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);

        System.out.println("El valor que va último de la pila es: " + pila.cima());

        while (!pila.esVacia()) {
            System.out.println(pila.longitud());
        }
    }
}
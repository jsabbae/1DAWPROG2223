package UTD4.Practica4.ejercicio1;

import UTD4.Practica4.ejercicio1.Geometria;

public class Triangulo extends Geometria {
    double base = 4;
    double altura = 2;

    public Triangulo(double base, double altura) {
        super((base * altura) / 2);
        this.base = base;
        this.altura = altura;
    }
}

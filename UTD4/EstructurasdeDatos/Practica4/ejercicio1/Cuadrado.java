package UTD4.Practica4.ejercicio1;

public class Cuadrado extends Geometria {
     double lado = 2;

    public Cuadrado(double lado) {
        super(lado*lado*lado*lado);
        this.lado = lado;
    }
}


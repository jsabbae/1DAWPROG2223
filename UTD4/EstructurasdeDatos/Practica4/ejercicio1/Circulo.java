package UTD4.Practica4.ejercicio1;

public class Circulo extends Geometria {
     double radio = 5;

    public Circulo() {
        super(Math.PI * (radio)*2 );
        this.radio = radio;
    }
}

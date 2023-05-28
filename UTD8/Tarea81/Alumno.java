package Tarea81;

public class Alumno extends Persona {
    private int grupo;
    private Ordenadores ordenador;

    public Alumno(String nombre, int grupo, Ordenadores ordenador) {
        super(nombre);
        this.grupo = grupo;
        this.ordenador = ordenador;
    }

    public int getGrupo() {
        return grupo;
    }

    public Ordenadores getOrdenadores() {
        return ordenador;
    }
}


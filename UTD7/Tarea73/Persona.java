package Tarea73;

import java.io.Serializable;

public class Persona implements Serializable {
    private String Nombre;
    private Integer Edad;
    private static String especie = "Humano";
    private Persona padre;
    private Direccion direccion;


    public Persona(String nombre, Integer edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }

    String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        this.Edad = edad;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Persona.especie = especie;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

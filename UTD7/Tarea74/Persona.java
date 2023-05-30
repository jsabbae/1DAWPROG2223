package Tarea74;


import java.io.Serializable;

public class Persona implements Serializable {
    private String Nombre;
    private Integer Telefono;
    private String Direccion;


    public Persona(String nombre, Integer telefono, String direccion) {
        this.Nombre = nombre;
        this.Telefono = telefono;
        this.Direccion = direccion;
    }

    String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        this.Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }
}

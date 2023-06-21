package alumno;

import persona.Persona;
import direccion.Direccion;

public class Alumno extends Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean Repetidor;
    private double notaMedia;
    private String correoElectronico;



    // Esta es la Restricción

    public Alumno(String nombre, String apellidos, int edad) {
        super(nombre);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setRepetidor(boolean Repetidor) {
        this.Repetidor = Repetidor;
    }

    public boolean isRepetidor() {
        return Repetidor;
    }
}







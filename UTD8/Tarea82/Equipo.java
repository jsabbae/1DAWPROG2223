package Tarea82;

public class Equipo {
    private int codigo;
    private String nombre;
    private String estadio;
    private String ciudad;
    private int numSocios;

    public Equipo(int codigo, String nombre, String estadio, String ciudad, int numSocios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.numSocios = numSocios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }
}


package direccion;

public class Direccion {
    private String calle;
    private String numero;
    private String piso;
    private String codigoPostal;
    private String localidad;
    private String provincia;

    public Direccion(String calle, String numero, String piso, String codigoPostal, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Direccion(String calle, String numero, String localidad) {
        this(calle, numero, "", "", localidad, "");
    }


    public String obtenerDireccionCompleta() {
        return calle + ", " + numero + ", " + piso + ". " + codigoPostal + " " + localidad + " (" + provincia + ")";
    }
    public Direccion obtenerDireccion() {
        return obtenerDireccion();
    }

    public void asignarDireccion(String calle) {
        this.calle = calle;
    }
    public String CalleYLocalidadAsignada() {
        return calle + ", " + localidad;
    }
}

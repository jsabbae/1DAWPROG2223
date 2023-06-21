import alumno.Alumno;
import direccion.Direccion;
import persona.Persona;
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa(100000, 'A', "1234");
        Alumno alumno = new Alumno("Juan", "Perez", 18);
        Direccion direccion = new Direccion("Calle Los Naranjos", "47", "3ºA", "11600", "Ubrique", "Cádiz");

        alumno.asignarDireccion(direccion);

        System.out.println("Detalles de la propiedad:");
        casa.ResultadoEnConsola();

        System.out.println("Detalles sobre el alumno:");
        System.out.println("Nombre del alumno: " + alumno.obtenerNombreCompleto());
        System.out.println("Edad: " + alumno.getEdad());

        Direccion direccionAlumno = alumno.obtenerDireccion();
        if (direccionAlumno != null) {
            System.out.println("EL alumno vive en:");
            System.out.println(direccionAlumno.obtenerDireccionCompleta());
        }
    }
}

package UTD5.Tarea51;

public class conjunto {
    import java.util.TreeSet;

    public class Persona implements Comparable{
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public int compareTo(Persona o) {
            int comparacionNombre = this.nombre.compareToIgnoreCase(o.nombre);
            if (comparacionNombre != 0) {
                return comparacionNombre;
            } else {
                return Integer.compare(this.edad, o.edad);
            }
        }

        @Override
        public String toString() {
            return nombre + "(" + edad + ")";
        }
    }

    class GrupoPersonas {
        private TreeSet<Persona> personas;

        public GrupoPersonas() {
            personas = new TreeSet<>();
        }

        public boolean agregarPersona(Persona persona) {
            if (persona == null) {
                return false;
            }
            return personas.add(persona);
        }
        }
    }
}

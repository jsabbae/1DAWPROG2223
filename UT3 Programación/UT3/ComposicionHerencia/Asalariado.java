package ComposicionHerencia;

public class Asalariado {
    public class Asalariado{
        private String nombre;
        private long dni;
        private int diasVacaciones;
        public Asalariado(String nombre, long dni, int diasVacaciones){
            this.nombre = nombre;
            this.dni = dni;
            this.diasVacaciones = diasVacaciones;
        }
        public String getNombre (){
            return this.nombre;
        }
        public void setNombre (String nuevo_nombre){
            this.nombre = nuevo_nombre;
        }
        public long getDni (){
            return this.dni;
        }

        public void setDni (long nuevo_dni){
            this.dni = nuevo_dni;
        }
        public int getDiasVacaciones (){
            return this.diasVacaciones;
        }
        public void setDiasVacaciones (int nuevo_diasVacaciones){
            this.diasVacaciones = nuevo_diasVacaciones;
        }
    }
}

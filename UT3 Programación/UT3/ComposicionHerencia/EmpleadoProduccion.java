package ComposicionHerencia;

import ComposicionHerencia.Asalariado;

public class EmpleadoProduccion {
    public class EmpleadoProduccion extends Asalariado {
        private String turno;
        public EmpleadoProduccion (String nombre, long dni, int
                diasVacaciones, String turno){
            super (nombre, dni, diasVacaciones);
            this.turno = turno;
        }
        public String getTurno (){
            return this.turno;
        }
        public void setTurno (String nuevo_turno){
            this.turno = nuevo_turno;
        }
    }
}

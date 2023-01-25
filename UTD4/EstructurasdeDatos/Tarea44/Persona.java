package UTD4.Tarea44;

import org.w3c.dom.ls.LSOutput;

public class Persona {
    String nombre;
    int edad;

    Persona (String nombre) {
        this.nombre = nombre;
    }

    Persona(int edad){
        this.edad = edad;
    }
    Persona() {}

    @Override
    public String toString() {
        return "Me llamo "+nombre +"Tengo " +edad;
    }

    Persona[] p = new Persona[3];
    p[0] = new Persona("Eustaquio" 90);
    p[1] = new Persona("Gustabo", 44);
    p[2] = new Persona("Jose" 25);
       System.out.println(Array.toString(personas));
}

package UTD5.Tarea51;

public class Main {

    public static void main(String[] args) {
        GrupoPersonas grupo = new GrupoPersonas();
        grupo.agregarPersona(new Persona("Manolo", 55));
        grupo.agregarPersona(new Persona("Pablo", 60));
        grupo.agregarPersona(new Persona("Eustaquio", 23));
        grupo.agregarPersona(new Persona("Rodolfo", 34));
        System.out.println("Personas en el grupo: " + grupo.getPersonas());
        System.out.println("Número de personas con edad 30: " + grupo.contarPersonasConMismaEdad(30));
    }
}

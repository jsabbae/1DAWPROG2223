package Tarea82;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class BaseDeDatosRelacionales {
    private List<Equipo> equipos;
    private List<Jugador> jugadores;
    private Scanner scanner;

    public BaseDeDatosRelacionales() {
        equipos = new ArrayList<>();
        jugadores = new ArrayList<>();

        // Escáner para que lea la entrada de usuario
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {


        public void Menu () {
            System.out.println("1. Dar de alta equipo");
            System.out.println("2. Dar de baja equipo");
            System.out.println("3. Dar de alta jugador");
            System.out.println("4. Dar de baja jugador");
            System.out.println("5. Consultar datos de equipo");
            System.out.println("6. Consultar datos de jugador");
            System.out.println("7. Modificar datos de equipo");
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                altaDeEquipo();
                break;
            case 2:
                bajaDeEquipo();
                break;
            case 3:
                altaDeJugador();
                break;
            case 4:
                bajaDeJugador();
                break;
            default:
                System.out.println("Incorrecto");
        }


        public static void  altaDeEquipo(){
            System.out.println("Introduzca el código de equipo");
            String codigo = scanner.nextLine();
        }

        public static void bajaDeEquipo(){
            System.out.println("Introduzca el código de equipo");
            String codigo = scanner.nextLine();
        }

        public static void altaDeJugador(){
            System.out.println("Introduzca el código de jugador");
            String codigo = scanner.nextLine();
        }

        public static void bajaDeJugador(){
            System.out.println("Introduzca el código de jugador");
            String codigo = scanner.nextLine();
        }
    }
}
package Tarea74;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class XML {
        public static void main(String[] args) {
            Persona persona1 = new Persona("Juan", 837192739,
                    "Avda. de Andalucía 89, Málaga");
            Persona persona2 = new Persona("Lucas", 392837497,
                    "Avda. Explanada Barnuevo 91, Las Palmas" );
            Persona persona3 = new Persona("Javier", 928402839,
                    " C/ Amoladera 62, Madrid" );
            Persona persona4 = new Persona("Manolo", 102839402,
                    "Alvaro Cunqueiro 49, Segovia" );
            Persona persona5 = new Persona("María", 103849586,
                    "Pl. Virgen Blanca 61, Barcelona" );

            FileOutputStream fos = null;
            ObjectOutputStream salida = null;


            try {
                //Se crea el fichero
                fos = new FileOutputStream("C:\\\\Users\\\\1DAW_2223_13\\\\Desktop\\\\Tarea74\\\\contactos.xml");
                salida = new ObjectOutputStream(fos);

                //Se escribe el objeto en el fichero
                salida.writeObject(persona1);
                salida.writeObject(persona2);
                salida.writeObject(persona3);
                salida.writeObject(persona4);
                salida.writeObject(persona5);

            } catch (FileNotFoundException e) {
                System.out.println("1" + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


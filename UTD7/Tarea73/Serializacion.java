package Tarea73;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacion {
    public static void main(String[] args) {
        Persona persona = new Persona("Marco Asensio", 27);
        persona.setDireccion(new Direccion("calle Doctor Fleming"));

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("C:\\\\Users\\\\1DAW_2223_04\\\\Desktop\\\\Tarea72\\\\serializacion.bin");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(p);

        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
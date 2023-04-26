package Tarea72;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
Crea un fichero llamado alumnos.txt dentro de una nueva carpeta con nombre 1DAW, controlando que si ya existe no haga nada. La carpeta debe estar en la raíz de tu usuario.
Introduce los nombres de los alumnos de la clase, una alumno por línea del fichero. Utiliza un buffer para realizar esta operación
Copia (lee y escribe) el contenido del anterior fichero a uno nuevo con nombre prog.txt
Renombra el fichero a prog_codificado.txt
En este último fichero, añade al final un alumno nuevo
Sustituye el segundo y tercer caracter del nombre de cada alumno por una X
 */
public class Ficheros {
    public static void main(String[] args) {
        try{
            // Para crear el directorio 1DAW
      File directorio1DAW = new File("C:\\Users\\Usuario\\1DAW");
            System.out.println(directorio1DAW.mkdir());

            //Para crear el fichero alumnos
            File alumnos = new File ("C:\\Users\\Usuario\\1DAW\\alumnos.txt");
            alumnos.createNewFile();


            // Para leer el fichero
            FileReader fichero = new FileReader(alumnos);
            int i;
            while ((i = fichero.read()) != -1){
                System.out.println((char) i);
            }
// Para escribir el contenido
            FileWriter fichero = new FileWriter(alumnos);
            fichero.close();

fichero = new FileWriter(alumnos, true);
fichero.write("Fran");
fichero.close();

// Para renombrar un fichero vamos a necesitar el File de crear fichero
// Y vamos a crear aquí el fichero que queremos llamarle

File prog_codificado = new File ("C:\\Users\\Usuario\\1DAW\\prog_codificado.txt")
if(alumnos.renameTo(prog_codificado)){
    System.out.println("Ya esta renombrado");
}else{
    System.out.println("No esta renombrado");
}



        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

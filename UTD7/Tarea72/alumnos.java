package Tarea72;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Fichero alumno.txt
public class alumnos {
try{
        FileOutputStream fileOutputStream = new FileOutputStream("alumnos");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
    bufferedOutputStream.write(("Jorge, Jonathan, Dani, Pablo, Juanma H, Juan Jesús, Ricardo, Adrián, Diego, Antonio," +
            " Julián, Juan María, Víctor, David, José, John, Jossie, Juanma S ").getBytes());
}

catch(IOException e){
        System.out.println(e.getMessage());
    }

// Fichero prog_codificado.txt
try{
        FileOutputStream fileOutputStream = new FileOutputStream("prog_codificado");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(("Jorge, Jonathan, Dani, Pablo, Juanma H, Juan Jesús, Ricardo, Adrián, Diego, Antonio," +
                " Julián, Juan María, Víctor, David, José, John, Jossie, Juanma S ").getBytes());
        bufferedOutputStream.write(("Fernando").getBytes());
}

catch(IOException e){
        System.out.println(e.getMessage());
    }
}

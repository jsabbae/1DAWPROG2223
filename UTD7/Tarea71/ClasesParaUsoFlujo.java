package Tarea71;

public class ClasesParaUsoFlujo {

/*
Ejercicio 6:

Investiga cada una de estas clases y crea un
ejemplo para explicar su funcionamiento al resto
de la clase.

●FileOutputStream
Representan ficheros de texto accedidos en orden secuencial, byte a byte.
● BufferedOutputStream
Es una zona de memoria temporal que hace que sea más eficiente la escritura en un
OutputStream.
● DataOutputStream
Escribe datos de tipo primitivo de una forma protable.
Esta clase tiene un sólo constructor
● ByteArrayOutputStream
Puede utilizarse para escribir una matriz de datos de salida.
● PrintStream
Permite agregar la capacidad de imprimir datos a una
corriente (flujo) de datos determinada.
● PipedOutputStream
Crea un flujo de salida canalizado que
aún no está conectado a un  flujo de entrada canalizado.
● FileInputStream
Representa ficheros de texto accedidos en orden secuncial, byte po byte.
● BufferedInputStream
Agrega nuevos atributos  a otros flujos de entrada,
la capacidad de almacenar en búfer la entrada.
● DataInputStream
Lee datos del tipo imprimitivo de una forma portable
● ByteArrayInputStream
Es una clase de stream de byte que se utiliza para leer los bytes de la matriz de bytes.
● SequenceInputStream
Concatenación de varios String en uno.
Crea un sólo stream de entrada desde varias fuentes de entrada.

import java.io.*;

public class Concatenate {
    public static void main(String[] args) throws IOException {
        ListOfFiles mylist = new ListOfFiles(args);

        SequenceInputStream s = new SequenceInputStream(mylist);
        int c;

        while ((c = s.read()) != -1)
           System.out.write(c);

        s.close();
    }
}


● PipedInputStream
Permite crear canales asíncronos (método de intercambio de mensajes)
 para comunicar threads.









Elabora la jerarquía de clases e indica los
paquetes a los que pertenecen.

JERARQUÍA DE CLASE DE ENTRADA
java.io.InputStream
java.io.ByteArrayInputStream
java.io.FilterInputStream
java.io.BufferedInputStream
java.io.DataInputStream
java.io.InputStream
java.io.FileInputStream
java.io.PipedInputStream
java.io.SequenceInputStream
java.io.ObjectInputStream

JERARQUÍA DE CLASE DE SALIDA
java.io.OutputStream
java.io.ByteArrayOutputStream
java.io.FilterOutputStream
java.io.BufferedOutputStream
java.io.DataOutputStream
java.io.PrintStream
java.io.OutputStream
java.io.FileOutputStream
java.io.PipedOutputStream
java.io.ObjectOutputStream









¿Eres capaz de encontrar más flujos a parte de
los de la lista?

-OutputStreamWriter
proporciona métodos para manejar el flujo de salida.
Los métodos que incluye son: void write

-InputStreamReader
Puede leer en forma de cadena de caracteres a partir de un stream de entrada.

-CharArrayWriter
Permite escribir una secuencia de caracteres en una cadena.
 */







/*
Ejercicio 7:

Investiga cada una de estas clases y crea un
ejemplo para explicar su funcionamiento al resto
de la clase.


● FileWriter
Escribe caracteres y cadenas de caracteres en archivos de texto que se puedan
leer por personas.
● BufferedWriter
Permite ecribir texto en un Outputstrema,
utilizando un buffer para proporcionar una escritura eficiente.
● CharArrayWriter
Escribe datos de caracteres y es útil para manipular datos de forma de caracteres
antes de escribirlos en un archivo.
● PrintWriter
Imprime desde lo más primitivo como números, texto hasta arrays y objetos.
● StringWriter
Permite escribir una cadena de forma sincrónica(si es necesario, procesa y responde)
o asincrónica(especifican el principio y el final de cada carácter)
● PipedWriter
Escribe datos que después son leidos en otro hilo de ejecución en una misma aplicación.
● FileReader
Permite que las aplicaciones web lean ficheros almacenados en el cliente
de forma asíncrona (el principio y el final de cada carácter).
● BufferedReader
Permite leer texto de un InputStream de una forma sencilla.
● LineNumberReader
Permite leer sucesivamente una línea de caracteres de un fichero de texto,
 partiendo desde el inicio del fichero.
● CharArrayReader
Consiste en leer datos en las que se necesitan manipular datos en forma de caracteres
antes de procesarlos.
● StringReader
Se utiliza cuando se necesitan manipular datos en
forma de caracteres que se han almacenado en una cadena de caracteres.
● PipedReader
Permite comunicar información entre dos hilos de ejecución en una misma aplicación.



Elabora la jerarquía de clases e indica los
paquetes a los que pertenecen.


Entrada ---> Reader
java.io.Reader
java.io.BufferedReader
java.io.FilterReader
java.io.PushbackReader
java.io.LineNumberReader
java.io.InputStreamReader
java.io.Reader
java.io.FileReader
java.io.PipedReader
java.io.CharArrayReader
java.io.StringReader


Salida ---> Writer
java.io.Writer
java.io.BufferedWriter
java.io.FilterWriter
java.io.OutputStreamWriter
java.io.Writer
java.io.FileWriter
java.io.PipedWriter
java.io.CharArrayWriter
java.io.StringWriter
java.io.PrintWriter



Añade al ejemplo la utilización de los métodos
mark y reset, explicando para qué los usas.

Estos dos métodos sirven para manejar el posicionamiento de lectura


El método mark su uso es leer la información y marcar un punto para establecer.
El método reset sirve para volver a la posición establecida enteriormente.




 */


}

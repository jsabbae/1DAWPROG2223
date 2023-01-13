package Interfaz;

import Interfaz.Borrable;
import Interfaz.Imprimible;

public class Impresora  implements Borrable, Imprimible {

        static final String pagina = "Hola";
        static final String contenido ="contenido";
        static String pagina="estas en la página 23";
        Impresora(){
            pagina=Imprimible.TEXTO_POR_DEFECTO;
        }
        public void establecerContenido(){
            System.out.println(contenido);
        }
        @Override
        public void imprime(){
            System.out.println(pagina);
        }
        @Override
        public void Borrar(){
            System.out.println(" ");
        }
        public void establecerContenido(String contenido){
            pantalla = pantalla + "" + contenido;
        }
    }



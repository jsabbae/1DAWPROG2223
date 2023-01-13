package Interfaz;

import Interfaz.Borrable;

public class Consola implements Imprimible, Borrable {
    String pantalla;

    @Override
    public void imprime() {
        System.out.println("'%$'" + pantalla);

    }

    @Override
    public void establecerContenido() {
   pantalla = PROMPT + contenido;
    }

    @Override
    public void Borrar() {
        int longitud = pantalla.length();
        pantalla = "";
        for (int i = 0; i < longitud; i++) {
            pantalla += "*";

            @Overridde
                    public void imprime(){
                pantalla = PROMPT + contenido;
            }
        }
    }
}

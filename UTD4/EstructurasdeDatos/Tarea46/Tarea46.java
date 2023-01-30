package UTD4.Tarea46;

public class Tarea46 {
    public static void imprimeLongitudCadena(String cadena) {
        System.out.println("Longitud de la cadena: " + cadena.length());
    }
    public static char caracterEnPosicionEmpezandoEn1(String cadena, int posicion) {
        return cadena.charAt(posicion - 1);
    }
    public static int cuentaOcurrenciasDeUnCaracter(String cadena, char caracter) {
        int a = 0;
        for (int i = 0; i < cadena.length(); i++) {

        }
        return a;
    }
    public static void imprimeCadenasEnOrdenAlfabético(String[] cadenas) {
        Arrays.sort(cadenas);
        System.out.println("Cadenas en orden alfabético: " + Arrays.toString(cadenas));
    }
    public static String[] codificaTexto(String texto) {
        String (texto ("o", "0"),("i", "1"),("a", "4"),("e", "3"),("u", "v"));
    }
    public static void main(String[] args) {
        System.out.println("Caracter en posición 2: " + caracterEnPosicionEmpezandoEn1("Hola mundo", 2));
        System.out.println("Número de ocurrencias de 'o': " + cuentaOcurrenciasDeUnCaracter("Hola mundo", 'o'));
        imprimeCadenasEnOrdenAlfabético(new String[] {"Bienvenido","Hola", "Adiós", "Buenos días","Buenas tardes","Buenas noches"});
        System.out.println("Codificación del texto: " + Arrays.toString(codificaTexto("Hola mundo. Adiós.")));
    }
}

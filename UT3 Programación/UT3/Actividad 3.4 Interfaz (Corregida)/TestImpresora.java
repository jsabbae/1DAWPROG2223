package Interfaz;

public class TestImpresora {
    public static void main(String[] args) {
        Imprimible impresora1 = new Impresora();
        impresora1.imprime();
        impresora1.imprime();
        impresora1.borrar();
        impresora1.imprime();
        impresora1.establecerContenido("Esto es un test");
        impresora1.imprime();

        Imprimible linuxBash = new Consola();
        linuxBash.imprime();
        linuxBash.borrar();
        linuxBash.imprime();
        linuxBash.establecerContenido("Esto es un test");
        linuxBash.imprime();

        linuxBash.borrar();
        linuxBash.imprime();

    }
}

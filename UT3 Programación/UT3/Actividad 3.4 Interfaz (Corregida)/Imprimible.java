package Interfaz;

public interface Imprimible extends Borrable, Editable {
    String pagina = "Pagina de prueba";
    private static String pagina = "Esta nueva página";
    private String color = "verde";
    public void establecerContenido(String contenido){
        pantalla = pantalla + contenido;
    }
    @Override
    public void imprime();
}

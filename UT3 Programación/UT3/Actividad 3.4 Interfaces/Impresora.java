public class Impresora implements Imprimible{
String pagina;
    public Impresora(){
        pagina = Imprimible.TEXTO_POR_DEFECTO;

    }

    @Override
    public void imprime(){
        System.out.println(pagina);
    }

}

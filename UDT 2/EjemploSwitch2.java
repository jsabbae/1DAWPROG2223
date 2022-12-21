public class EjemploSwitch2 {
    //Dado un mes dar el núm de días que tiene
    public enum Mes {
        Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre
    }
    public static void main(String[] args) {

        
    
    Mes mesDeHoy = Mes.Enero;

    switch (mesDeHoy) {
    case Enero:System.out.println( "Tiene 31 Días");
    break;
   case Febrero:System.out.println("Tiene 28 o 29 Días");
    break;
    case Marzo: System.out.println("Tiene 31 Días");
    break;
   case Abril: System.out.println("Tiene 30 Días");
    break;
   case Mayo: System.out.println( "Tiene 31 Días");
    break;
    case Junio:System.out.println("Tiene 30 Días");
    break;
    case Julio: System.out.println("Tiene 31 Días");
    break;
    case Agosto:System.out.println("Tiene 31 Días");
    break;
    case Septiembre:System.out.println("Tiene 30 Días");
    break;
    case Octubre:System.out.println("Tiene 31 Días");
    break;
    case Noviembre: System.out.println("Tiene 30 Días");
    break;
    case Diciembre: System.out.println("Tiene 31 Días");
    break;
}
    }
}

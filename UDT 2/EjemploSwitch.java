public class EjemploSwitch {
    enum Dia {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO

    public static void main(String[] args){

        
        }
        Dia diaDeHoy = Dia.Miercoles;
        switch (diaDeHoy){
        case LUNES:
        System.out.println(x: "Lunes");
        break;
       case MARTES:
        System.out.println(x: "Martes");
        break;
        case MIERCOLES:
        System.out.println(x: "Miercoles");
        break;
       case JUEVES:
        System.out.println(x: "Jueves");
        break;
       case VIERNES:
        System.out.println(x: "Viernes");
        break;
        case SABADO:
        System.out.println(x: "Sabado");
        break;
        case DOMINGO:
        System.out.println(x: "Domingo");
        break;
        }
    }
}

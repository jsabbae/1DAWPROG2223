public class SwitchStatement {
    public static void main(String[] args) {

        int mes = 12;
        String mes = 12;
        String mesString = "valor no válido";
        switch (mes) {
            case 1: mesString = "Enero";
            break;
            case 2: mesString = "Febrero";
            break;
            case 3: mesString = "Marzo";
            break;
            case 4: mesString = "Abril";
            break;
            case 5: mesString = "Mayo";
            break;
            case 6: mesString = "Junio";
            break;
            case 7: mesString = "Julio";
            break;
            case 8: mesString = "Agosto";
            break;
            case 9: mesString = "Septiembre";
            break;
            case 10: mesString = "Octubre";
            break;
            case 11: mesString = "Noviembre";
            break;
            case 12: mesString = "Diciembre";
            break;
            default : mesString = "valor no válido";
            break;
            System.out.println(mesString);
        }
    }
}

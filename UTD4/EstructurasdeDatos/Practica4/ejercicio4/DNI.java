package UTD4.Practica4.ejercicio4;




public class DNI {
    char DNI;

    public static void main(String[] args) {
        System.out.print("Introduce el DNI: ");

        if(DNI = 9){
            System.out.println("El DNI es correcto");
        } else(DNI != 9) {
            System.out.println(" DNI es incorrectos");
            return;
        }

        int numero = Integer.parseInt(numeroDNI);
        DNI = calculaLetraDNI(numero);

        if (DNI != letraIntroducida) {
            System.out.println("El DNI introducido no es válido: la letra no coincide con la calculada.");
        }
    }
    private static char Letra(int numeroDNI) {
        String letras = "ABQWKDJASDHEHSYDHBSNVXZ";
        return letras.charAt(numeroDNI % 23);
    }
}

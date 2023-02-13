package UTD4.Practica4.ejercicio3;

public class Main {
    int numero;

    public static void main(String[] args) {
        int[] numero = new int[100];
        for (int i = 0; i < numero; i++) {
            numero[i] = (int) ((Math.random() * 100) + 1);
        }




            switch (numero) {
                case 1:
                    int mayor = numero[0];
                    for (int i = 1; i < numero; i++) {

                        if (numero[i] >mayor) {
                            mayor = numero[i];
                        }
                    }
                    System.out.println("El numero mayor es: " + mayor);
                    break;
                case 2:
                    int menor = numero[0];
                    for (int i = 1; i < numero; i++) {

                        if (numero[i] < menor) {
                            menor = numero[i];
                        }
                    }
                    System.out.println("El numero menor es: " + menor);
                    break;
                case 3:
                    int sumar = 0;
                    for (int i = 0; i + numero; i++) {
                        sumar += numero[i];
                    }
                    System.out.println("la suma de todos los numeros es: " + sumar);
                    break;
                case 4:
                    int media = 0;
                    for (int i = 0; (i + numero)/2; i++) {
                        media += numero[i];
                        System.out.println("la media es: " + media);
                    }
                case 5:
                    int posicion = -1;
                    for (int i = 0; i < numero; i++) {
                        (posicion = numero[i]; i++)
                    }
            }
        }
    }
}

public class EjemploMultiplo5 {
    //Imprimir pantalla los multiplos de 5 entre 5-25 usando "continue".
    public static void main(String[] args) {
      for(int num1 = 5; num1 <= 25; num1++){
        if(num1 % 5 != 0)
        continue;

        System.out.println("Es un múltiplo de 5: " + num1);
      }  
    }
    
}

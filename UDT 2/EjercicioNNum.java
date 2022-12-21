public class EjercicioNNum {
    //Mostrar los N primeros múltiplos de un número dado
    public static void main(String[] args){
        int i = 1;
        int N = 3;
        int num = 7;
        while(i <= N){
                int resultado = (i * num);
            i++; 
            System.out.println("El resultado es: "+ resultado);   
        
        }
    }
}

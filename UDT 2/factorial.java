public class factorial {
    //Calcular factorial de un número
    public static void main(String[] args) {
    

    int num=3;
    int result=0;
    System.out.println("Calcular factorial de un número "+num);

      for( int i=num; i>=1;i--){
          result= i*num;
      }
}
}

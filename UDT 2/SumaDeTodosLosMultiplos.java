public class SumaDeTodosLosMultiplos {
    private static final int N=10;
    //Dado un número n, escribir la suma de todos los mútiplos de 3 y 5 hasta n
     public static void main(String[] args) {
         int suma=0;
        for(int i= 1;i<=N; i++){
            if(i%3==0||i % 5==0){
                suma +i;
            }
        }
         System.out.print(resultado);
        for(int n= 1;n<=3;){
            resultado= 3+n;
        }
        System.out.print(resultado);
    }
}

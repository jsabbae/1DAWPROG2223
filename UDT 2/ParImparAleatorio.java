public class ParImparAleatorio {
 public static void main(String[] args){

    int max = 100;

    int enteroRandom = (int)Math.floor(Math.random()*max);

    String par = enteroRandom + "es par";
    String impar = enteroRandom + "es impar";

    if(enteroRandom % 2 == 0)
    System.out.println (par);

    else
    System.out.println (impar);

 }   
}

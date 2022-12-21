public class EjemploSelectiva2 {
    
    public static void main(String[] args) {
        Integer a = 7;
        Integer b = 3;
        Integer mayor=(a>=b)? a:b;
        Integer menor=(a<b)? a:b;



        //Inecesario esto
        if (a<=b) {
            menor = a;
        } else{
            menor = b;
        }
        menor = (a <= b) ? a:b ;

        System.out.println(menor);
    }
}

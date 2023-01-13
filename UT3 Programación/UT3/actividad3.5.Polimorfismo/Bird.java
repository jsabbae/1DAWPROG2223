package polimorfismo.ejemplo2;

public class Bird extends Animal implements Flyable{
    void metodo() {


        @Override
        void speak () {
            System.out.println("LA paloma canta");
        }

        @Override
        public void fly () {
            System.out.println("La paloma vuela");
        }
    }
}

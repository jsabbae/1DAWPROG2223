package polimorfismo.ejemplo2;

public class Lion extends Animal implements Flyable {
    @Override

  public void speak(){
        System.out.println("Gruaaaa!");
    }
}

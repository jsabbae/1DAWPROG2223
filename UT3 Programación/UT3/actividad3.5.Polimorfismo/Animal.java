package polimorfismo.ejemplo2;

public abstract class Animal {
    abstract void speak();
    Animal a;
    a = new Lion();
a.speak();
    a = new Bird();
a.speak();
}

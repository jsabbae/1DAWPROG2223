package polimorfismo.ejemplo2;

import polimorfismo.ejemplo1.SubclaseA;

public class Principal {
    public static void main(String[] args) {
        Superclase s;
s= new SubclaseA();
s.metodo();

s= new SubclaseB();
s.metodo();

        Animal a;
        a=new Lion();
        a.speak();
        a = new Bird;
        a.speak();
        ((Bird)a).fly();
    }
}

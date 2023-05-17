package flyweight.main;


import composite.clase.UnitateBancara;
import flyweight.clase.Cont;
import flyweight.clase.Detinator;
import flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Cont cont1 = new Cont(100,2);
        Cont cont2 = new Cont(101,3);
        Cont cont3 = new Cont(111,6);
        Cont cont4 = new Cont(122,1);

        Detinator detinator = new Detinator("Ana",364627,"str principala");
        detinator.descriere(cont1);
    }
}
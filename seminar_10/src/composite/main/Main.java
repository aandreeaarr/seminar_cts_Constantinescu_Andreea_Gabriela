package composite.main;

import composite.clase.Filiala;
import composite.clase.Sucursala;
import composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara s1 = new Sucursala("sucursala 1",10);
        UnitateBancara s2 = new Sucursala("sucursala 2",15);

        UnitateBancara a1 = new Sucursala("agentie 1",10);
        UnitateBancara a2 = new Sucursala("agentie 2",15);

        UnitateBancara f1 = new Filiala("filiala 1",2);
        UnitateBancara f2 = new Filiala("filiala 2",4);
        UnitateBancara f3 = new Filiala("filiala 3",8);
        UnitateBancara f4 = new Filiala("filiala 4",3);

        s1.adaugaUnitate(s2);
        s1.adaugaUnitate(a1);
        s1.adaugaUnitate(f1);
        a1.adaugaUnitate(f2);
        s2.adaugaUnitate(f3);
        s2.adaugaUnitate(f4);

        s1.printDescriere(" ");
    }
}
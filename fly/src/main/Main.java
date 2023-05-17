package main;

import clase.Cont;
import clase.Detinator;
import clase.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Detinator d1 = (Detinator) factory.getObiect(1);
        d1.descriere(new Cont(1,100));
        Detinator d2 = (Detinator) factory.getObiect(1);
        d2.descriere(new Cont(1,100));
        Detinator d3 = (Detinator) factory.getObiect(1);
        d3.descriere(new Cont(1,100));
    }
}
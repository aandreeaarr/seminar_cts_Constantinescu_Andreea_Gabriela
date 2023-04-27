package facade.main;

import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.interogheazaPacient("Andreea");
        facade.interogheazaPacient("Costel");
        facade.interogheazaPacient("Stefan");
        facade.interogheazaPacient("Andreea");
        facade.interogheazaPacient("Andreea");
        facade.interogheazaPacient("Andreea");
    }
}
package simple_factory.main;

import simple_factory.clase.PersonalSpital;
import simple_factory.clase.SimpleFactory;
import simple_factory.clase.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PersonalSpital personalSpital1 = simpleFactory.create(TipPersonal.ASISTENT,"GIGI");
        PersonalSpital personalSpital2 = simpleFactory.create(TipPersonal.MEDIC,"LIVIU");
        PersonalSpital personalSpital3 = simpleFactory.create(TipPersonal.ASISTENT,"LEANA");
        PersonalSpital personalSpital4 = simpleFactory.create(TipPersonal.BRANCARDIER,"GOGU");

        List<PersonalSpital> personalSpitals = new ArrayList<>();
        personalSpitals.add(personalSpital1);
        personalSpitals.add(personalSpital2);
        personalSpitals.add(personalSpital3);
        personalSpitals.add(personalSpital4);

        for(PersonalSpital p: personalSpitals) {
            p.descriere();
        }
    }
}
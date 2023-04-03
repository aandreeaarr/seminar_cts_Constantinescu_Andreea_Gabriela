package factory_method.main;

import factory_method.clase.FactoryBrancardier;
import factory_method.clase.FactoryMedic;
import factory_method.clase.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic medic = new FactoryMedic();
        FactoryBrancardier brancardier = new FactoryBrancardier();

        List<PersonalSpital> personalSpitals = new ArrayList<>();
        personalSpitals.add(medic.creazaPersonal("Costica"));
        personalSpitals.add(brancardier.creazaPersonal("Coman"));
        personalSpitals.add(medic.creazaPersonal("Marian"));

        for(PersonalSpital p: personalSpitals) {
            p.descriere();
        }
    }
}
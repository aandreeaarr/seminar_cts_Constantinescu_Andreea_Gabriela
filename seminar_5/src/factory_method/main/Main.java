package factory_method.main;

import factory_method.clase.FactoryBrancardier;
import factory_method.clase.FactoryMedic;
import factory_method.clase.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryMedic.createPersonal("Ciprian"));
        listaPersonal.add(factoryMedic.createPersonal("John"));
        listaPersonal.add(factoryBrancardier.createPersonal("Gigi"));

        for (PersonalSpital ps : listaPersonal) {
            ps.afiseazaDescriere();
        }
    }
}
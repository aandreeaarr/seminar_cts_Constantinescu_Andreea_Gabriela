package factory_method.clase;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital creazaPersonal(String name) {
        return new Medic(name);
    }
}

package factory_method.clase;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Medic(name);
    }
}
package factory_method.clase;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Brancardier(name);
    }
}
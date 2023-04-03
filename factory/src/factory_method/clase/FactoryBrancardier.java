package factory_method.clase;

public class FactoryBrancardier implements Factory{
    @Override
    public PersonalSpital creazaPersonal(String name) {
        return new Brancardier(name);
    }
}

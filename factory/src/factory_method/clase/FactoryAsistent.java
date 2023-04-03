package factory_method.clase;

public class FactoryAsistent implements Factory{
    @Override
    public PersonalSpital creazaPersonal(String name) {
        return new Asistent(name);
    }
}

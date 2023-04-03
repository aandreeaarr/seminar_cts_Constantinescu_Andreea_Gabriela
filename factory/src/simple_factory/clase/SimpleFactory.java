package simple_factory.clase;

public class SimpleFactory {
    public PersonalSpital create(TipPersonal tipPersonal, String name) {
        switch (tipPersonal) {
            case MEDIC:return new Medic(name);
            case ASISTENT:return new Asistent(name);
            case BRANCARDIER:return new Brancardier(name);
            default: return null;
        }
    }
}

package factory_method.clase;

public class Medic extends PersonalSpital {

    public Medic(String name) {
        super(name);
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + super.getName());
    }
}

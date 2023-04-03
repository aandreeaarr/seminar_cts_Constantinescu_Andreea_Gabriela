package simple_factory.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String name) {
        super(name);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul " + super.getName());
    }
}

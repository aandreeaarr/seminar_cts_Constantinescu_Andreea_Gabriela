package simple_factory.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String name) {
        super(name);
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul " + super.getName());
    }
}

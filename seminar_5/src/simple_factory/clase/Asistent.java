package simple_factory.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistent" + super.getName());
    }
}
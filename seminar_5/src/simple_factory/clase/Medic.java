package simple_factory.clase;

public class Medic extends PersonalSpital {
    public Medic(String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medic" + super.getName());
    }
}
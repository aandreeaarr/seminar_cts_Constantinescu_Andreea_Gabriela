package factory_method.clase;

public abstract class PersonalSpital {

    private String name;

    public PersonalSpital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void descriere();
}

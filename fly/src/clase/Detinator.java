package clase;

public class Detinator implements IClientBanca{
    private String nume;
    private String adresa;

    public Detinator(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(cont.toString() + this.toString());
    }
}

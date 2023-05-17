package flyweight.clase;

public class Detinator implements IClientBanca{
    private String nume;
    private int nrTelefon;
    private String adresa;

    public Detinator(String nume, int nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println("detinator: " + nume
                + " cu numarul de telefon: " + nrTelefon +cont.toString());
    }
}

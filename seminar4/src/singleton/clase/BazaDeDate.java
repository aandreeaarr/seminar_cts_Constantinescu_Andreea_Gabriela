package singleton.clase;

public class BazaDeDate {
    private int numarTabele;
    private String denumire;
    private int dimensiune;
    public static BazaDeDate instanta = new BazaDeDate(3, "bazaDeDate",4);

    private BazaDeDate(int numarTabele, String denumire, int dimensiune) {
        this.numarTabele = numarTabele;
        this.denumire = denumire;
        this.dimensiune = dimensiune;
    }

    public static BazaDeDate getInstance() {
        return BazaDeDate.instanta;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDeDate{");
        sb.append("numarTabele=").append(numarTabele);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}
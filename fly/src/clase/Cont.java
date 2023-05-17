package clase;

public class Cont {
    private int nrCont;
    private float suma;

    public Cont(int nrCont, float suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("nrCont=").append(nrCont);
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}

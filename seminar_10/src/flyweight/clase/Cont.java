package flyweight.clase;

public class Cont {
    private float suma;
    private int nr;

    public Cont(float suma, int nr) {
        this.suma = suma;
        this.nr = nr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("suma=").append(suma);
        sb.append(", nr=").append(nr);
        sb.append('}');
        return sb.toString();
    }
}

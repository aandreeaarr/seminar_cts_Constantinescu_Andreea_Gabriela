package clase;

public class Loc {
    private int numarLoc;
    private IStare stare;

    public Loc(int numarLoc) {
        this.numarLoc = numarLoc;
        stare = new StareLiber();
    }

    public int getNumarLoc() {
        return numarLoc;
    }

    public void setNumarLoc(int numarLoc) {
        this.numarLoc = numarLoc;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    public IStare getStare() {
        return stare;
    }

    public void rezervaLoc() {
        IStare stare1 = new StareRezervat();
        stare.modificaStare(this);
    }
    public void elibereazaLoc() {
        IStare stare1 = new StareLiber();
        stare.modificaStare(this);
    }
    public void ocupaLoc() {
        IStare stare1 = new StareOcupat();
        stare.modificaStare(this);
    }
}

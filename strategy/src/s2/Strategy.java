package s2;

public class Strategy {
    IMetodaPlata metodaPlata;

    public Strategy() {
        this.metodaPlata = new Cash();
    }

    public  void setStrategie(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void operatie() {
        metodaPlata.plateste();
    }
}

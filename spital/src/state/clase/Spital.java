package state.clase;

public class Spital {

    private IStare stare;

    public Spital(IStare stare) {
        this.stare = stare;
    }

    public void setSare(IStare stareq) {
        this.stare=stareq;
    }

    public void interneazaPacient() {
        this.stare = new Internat();
        stare.interneaza(this);
    }

    public void subObs() {
        this.stare = new SubObervatie();
        stare.interneaza(this);
    }
}

package clase;

public class ComandaPleaca implements ICommand{
    private int nrLinie;
    private IAutomobil automobil;

    public ComandaPleaca(int nrLinie, IAutomobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void executa() {
        automobil.pleaca(nrLinie);
    }
}

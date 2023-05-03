package strategy.clase;

public class Operator {
    private IModVerificare modDeVeridicare;

    public Operator() {
        this.modDeVeridicare = new VerificarePersoanaFizica();
    }

    public void setModDeVeridicare(IModVerificare modDeVeridicare) {
        this.modDeVeridicare = modDeVeridicare;
    }
    public void verificaClient() {
        modDeVeridicare.verifica();
    }
}

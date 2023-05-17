package s1.clase;

public class Verificare {
    IStrategy strategy;

    public Verificare() {
        this.strategy = new PersoanaFizica();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void VerificaClient() {
        strategy.procesareDocumente();
    }

}

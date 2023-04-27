package decorator.clase;

public abstract class DecoratorAbstract implements FurnizareRezultat {
    private FurnizareRezultat atr;

    public DecoratorAbstract(FurnizareRezultat atr) {
        this.atr = atr;
    }

    @Override
    public void printareRezultat(String diagnostic) {
        atr.printareRezultat(diagnostic);
    }

    public abstract void afisareOnline(String diagnostic);
}
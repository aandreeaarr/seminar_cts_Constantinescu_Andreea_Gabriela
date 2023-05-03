package strategy.clase;

public class VerificarePersoanaFizica implements IModVerificare{
    @Override
    public void verifica() {
        System.out.println("Verifica buletinul persoanei fizice!");
    }
}

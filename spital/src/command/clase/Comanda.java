package command.clase;

public class Comanda implements ICommand{

    private IMedic medic;

    public Comanda() {
        this.medic = new Medic("grava");
    }

    @Override
    public void executaTriaj() {
        medic.trimite();
    }
}

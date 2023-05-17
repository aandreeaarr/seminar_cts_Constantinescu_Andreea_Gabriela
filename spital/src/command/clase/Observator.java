package command.clase;

import java.util.ArrayList;
import java.util.List;

public class Observator {

    List<ICommand> lista;

    public Observator() {
        this.lista = new ArrayList<>();
    }

    public void triaj(ICommand command) {
        lista.add(command);
    }

    public void undo() {
        lista.get(0).executaTriaj();
        lista.remove(0);
    }
}

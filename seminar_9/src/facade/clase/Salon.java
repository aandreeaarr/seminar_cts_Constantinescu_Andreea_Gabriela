package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon() {
        this.coduriPaturiLibere = new ArrayList<>();
    }

    public void adaugaPat(int pat) {
        this.coduriPaturiLibere.add(pat);
    }


    public boolean verificarePaturiLibere() {
        return !coduriPaturiLibere.isEmpty();
    }

    public void ocupaPat() {
        coduriPaturiLibere.remove(0);
    }

}
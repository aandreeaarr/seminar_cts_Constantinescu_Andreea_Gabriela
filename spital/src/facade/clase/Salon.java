package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> codPatLiber;

    public Salon() {
        this.codPatLiber = new ArrayList<>();
    }

    public boolean verificaPat() {
        return codPatLiber.size()>0;
    }

    public void adaugaPat(int codPatLiber) {
        this.codPatLiber.add(codPatLiber);
    }

    public void ocupaPat() {
        this.codPatLiber.remove(0);
    }
}

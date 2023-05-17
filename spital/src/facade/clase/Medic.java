package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    List<Pacient> listaPacienti;

    public Medic() {
        this.listaPacienti = new ArrayList<>();
    }

    void verificaTrimitere(Pacient pacient) {
        if(pacient.getGravitate()>7) {
            System.out.println("Trebuie internat pacientul " +
                    pacient.getNume());
        }
        else {
            System.out.println("Nu trebuie internat pacientul " +
                    pacient.getNume());
        }
    }

    public Pacient getPacient(String nume) {
        for(Pacient pacient:listaPacienti) {
            if(pacient.getNume().equals(nume)) {
                return pacient;
            }
        }
        return null;
    }
    public void adaugaPacient(Pacient pacient) {
        this.listaPacienti.add(pacient);
    }
}

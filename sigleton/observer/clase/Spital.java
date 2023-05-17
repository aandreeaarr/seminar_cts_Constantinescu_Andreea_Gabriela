package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{

    List<IPacient> lista;

    public Spital() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void abonare(IPacient pacient) {
        lista.add(pacient);
    }

    @Override
    public void dezabonare(IPacient pacient) {
        lista.remove(pacient);
    }

    @Override
    public void notificarePacienti(String mesaj) {
        for(IPacient p:lista) {
            p.primesteNotificare(mesaj);
        }
    }

    public void virus() {
        notificarePacienti("virus in zona");
    }
}

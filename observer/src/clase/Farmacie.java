package clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie{
    private String denumire;
    List<IClient> listClienti;

    public Farmacie(String denumire) {
        this.denumire = denumire;
        this.listClienti = new ArrayList<>();
    }

    @Override
    public void aboneaza(IClient client) {
        listClienti.add(client);
    }

    @Override
    public void dezaboneaza(IClient client) {
        listClienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for(IClient client: listClienti) {
            client.primesteNotificare(notificare);
        }
    }
    public void modificarePret(String medicament){
        trimiteNotificare(medicament + "are o reducere de pret");
    }
}

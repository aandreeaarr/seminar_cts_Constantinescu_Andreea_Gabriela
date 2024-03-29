package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti=new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notificareClient(String mesaj) {
        for(IClient client: listaClienti) {
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOferta() {
        String oferta = new String(this.nume + "are oferta nou!");
        notificareClient(oferta);
    }

    public void adaugaDiscount(int discount) {
        String mesaj = new String(this.nume + " a introdus un discount de " + discount);
        notificareClient(mesaj);
    }
}

package observer.main;

import observer.clase.Client;
import observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andreea");
        Client client2 = new Client("Maria");
        Client client3 = new Client("Ana");
        Client client4 = new Client("Alin");

        Restaurant restaurant = new Restaurant("Amada");
        restaurant.introduceOferta();
        restaurant.abonareClient(client1);
        restaurant.adaugaDiscount(5);
        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);
        restaurant.introduceOferta();
    }
}
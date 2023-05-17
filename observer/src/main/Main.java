package main;

import clase.Client;
import clase.Farmacie;
import clase.IFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Dona");
        farmacie.aboneaza(new Client("123"));
        farmacie.aboneaza(new Client("456"));
        farmacie.aboneaza(new Client("936"));
        farmacie.modificarePret("Autan");

    }
}
package main;

import singleton.clase.BazaDeDate;
import singleton.clase.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstanta(2345,4);
        Secretariat secretariat2 = Secretariat.getInstanta(2335,6);

        System.out.println(secretariat1.toString());
        System.out.println(secretariat2.toString());

        BazaDeDate bazaDeDate1 = BazaDeDate.getInstance();
        BazaDeDate bazaDeDate2 = BazaDeDate.getInstance();

        System.out.println(bazaDeDate1.toString());
        System.out.println(bazaDeDate2.toString());

        bazaDeDate2.setDimensiune(1);
        bazaDeDate1.setDimensiune(30);

        System.out.println(bazaDeDate1.toString());
        System.out.println(bazaDeDate2.toString());

    }
}
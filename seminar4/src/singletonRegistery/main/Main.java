package singletonRegistery.main;

import singletonRegistery.InstitutiePublica;

public class Main {
    public static void main(String[] args) {

        InstitutiePublica institutiePublica1 = InstitutiePublica.getInstance("ANAF");
        InstitutiePublica institutiePublica2 = InstitutiePublica.getInstance("politie");
        InstitutiePublica institutiePublica3 = InstitutiePublica.getInstance("ANAF");

        institutiePublica1.setNumarAngajati(100);
        institutiePublica2.setNumarAngajati(150);
        institutiePublica3.setNumarAngajati(200);

        System.out.println(institutiePublica1.toString());
        System.out.println(institutiePublica2.toString());
        System.out.println(institutiePublica3.toString());
    }
}
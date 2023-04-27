package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.FurnizareRezultat;
import decorator.clase.RezultatOnline;
import decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat rezultatPeHartie = new RezultatPeHartie();
        rezultatPeHartie.printareRezultat("raceala foarte grava");

        DecoratorAbstract decoratorAbstract = new RezultatOnline(rezultatPeHartie);
        decoratorAbstract.afisareOnline("gripa");

        decoratorAbstract.printareRezultat("entorsa");
    }
}
package composite.main;

import composite.clase.DecoratorAbstract;
import composite.clase.FurnizareRezultat;
import composite.clase.RezultatOnline;
import composite.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat rezultatPeHartie = new RezultatPeHartie();
        rezultatPeHartie.printareRezultat("raceala foarte grava");

        DecoratorAbstract decoratorAbstract = new RezultatOnline(rezultatPeHartie);
        decoratorAbstract.afisareOnline("gripa");

        decoratorAbstract.printareRezultat("entorsa");
    }
}
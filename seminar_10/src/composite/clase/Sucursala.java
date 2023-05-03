package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara{
    private String nume;
    private int numarAngajati;
    private List<UnitateBancara> lista;

    public Sucursala(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
        this.lista=new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara)  {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int i) {
        return lista.get(i);
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare + "Sucursala: " + this.nume + " are filialele: ");
        for(UnitateBancara u: lista) {
            u.printDescriere(indentare + "  ");
        }
    }
}

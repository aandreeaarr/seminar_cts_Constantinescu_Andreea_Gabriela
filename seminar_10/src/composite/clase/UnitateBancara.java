package composite.clase;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitateBancara) ;
    void stergeUnitate(UnitateBancara unitateBancara);
    UnitateBancara getUnitate(int i );
    void printDescriere(String indentare);
}

public interface IDepartament {

    void descriere();
    void adaugaDepartament(IDepartament departament);
    void stergereDepartament(IDepartament departament);
    IDepartament getNod(int i);
}

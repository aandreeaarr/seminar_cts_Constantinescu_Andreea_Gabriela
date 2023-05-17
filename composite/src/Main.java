public class Main {
    public static void main(String[] args) {
        Departament departament = new Departament();
        Departament departament1 = new Departament();
        Departament departament2 = new Departament();

        Sectie sectie = new Sectie();

        departament.adaugaDepartament(departament1);
        departament.adaugaDepartament(departament1);
        departament.adaugaDepartament(sectie);

        departament.descriere();
    }
}
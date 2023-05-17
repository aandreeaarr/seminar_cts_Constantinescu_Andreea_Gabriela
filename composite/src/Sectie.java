public class Sectie implements IDepartament{
    @Override
    public void descriere() {
       System.out.println("Sectie");
    }

    @Override
    public void adaugaDepartament(IDepartament departament) {
        throw new RuntimeException();
    }

    @Override
    public void stergereDepartament(IDepartament departament) {
        throw new RuntimeException();
    }

    @Override
    public IDepartament getNod(int i) {
        return null;
    }
}

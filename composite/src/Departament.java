import java.util.ArrayList;
import java.util.List;

public class Departament implements IDepartament{

    List<IDepartament> lista;

    public Departament() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println("dep");
    }

    @Override
    public void adaugaDepartament(IDepartament departament) {
        lista.add(departament);
    }

    @Override
    public void stergereDepartament(IDepartament departament) {
        lista.remove(departament);
    }

    @Override
    public IDepartament getNod(int i) {
        return lista.get(i);
    }
}

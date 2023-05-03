package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String,IClientBanca> mapF;

    public FlyweightFactory() {
        this.mapF = new HashMap<>();
    }

    public IClientBanca getClient(String nume, int nrTelefon, String adresa) {
        if(!mapF.containsKey(nume)) {
            mapF.put(nume,new Detinator(nume,nrTelefon,adresa));
        }
        return mapF.get(nume);
    }
}

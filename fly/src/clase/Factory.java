package clase;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    Map<Integer,IClientBanca> map;

    public Factory() {
        this.map = new HashMap<>();
    }

    public IClientBanca getObiect(int cheie) {
        if(!map.containsKey(cheie)) {
            map.put(cheie,new Detinator("Andreea","lalele"));
        }
        return map.get(cheie);
    }
}

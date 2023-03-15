package singletonRegistery;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {

    private String denumire;
    private int numarAngajati;
    private static Map<String,InstitutiePublica> registruInstitutii= new HashMap<>();

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized InstitutiePublica getInstance(String denumire) {
        if(InstitutiePublica.registruInstitutii.containsKey(denumire)) {
            return InstitutiePublica.registruInstitutii.get(denumire);
        }
        else {
            InstitutiePublica institutiePublica = new InstitutiePublica(denumire, 0);
            InstitutiePublica.registruInstitutii.put(denumire,institutiePublica);
            return institutiePublica;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }
}

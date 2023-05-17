package s1.main;

import s1.clase.PersoanaJuridica;
import s1.clase.Verificare;

public class Main {
    public static void main(String[] args) {
        Verificare verificare = new Verificare();
        verificare.VerificaClient();
        verificare.setStrategy(new PersoanaJuridica());
        verificare.VerificaClient();
    }
}
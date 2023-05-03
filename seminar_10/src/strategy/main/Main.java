package strategy.main;

import strategy.clase.Operator;
import strategy.clase.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.verificaClient();
        operator.setModDeVeridicare(new VerificarePersoanaJuridica());
        operator.verificaClient();
    }
}
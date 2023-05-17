package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IAutomobil automobil = new Autobuz(1);

        ICommand command = new ComandaPleaca(1,automobil);

        Operator operator = new Operator();
        operator.invoca(command);
        operator.undo(command);
        operator.invoca(new ComandaPleaca(
                2,new Autobuz(10)));
        operator.undo(command);
    }
}
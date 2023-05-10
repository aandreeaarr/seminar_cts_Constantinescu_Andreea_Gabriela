package state.main;

import state.clase.Masa;

public class Main {
    public static void main(String[] args) {
      Masa masa1 = new Masa(1);
      Masa masa2 = new Masa(2);
      Masa masa3 = new Masa(3);

      masa1.ocupareMasa();
      masa1.ocupareMasa();
      masa1.rezervaMasa();
      masa1.elibereazaMasa();
      masa1.ocupareMasa();
    }
}
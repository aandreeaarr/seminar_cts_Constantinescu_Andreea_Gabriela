package clase;

public class Autobuz implements IAutomobil{
    private int numarAutobuz;

    public Autobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
    }

    @Override
    public void pleaca(int linie) {
        System.out.println("Autobuzul " + numarAutobuz +
                " a plecat in cursa pe linia " + linie);
    }
}

package command.clase;

public class Medic implements IMedic{

    private String stare;

    public Medic(String stare) {
        this.stare = stare;
    }

    @Override
    public void trimite() {
        if(stare=="grav") {
            System.out.println("trimite la tratare imediata");
        }
        else{
            System.out.println("trimite la internare");
        }
    }
}

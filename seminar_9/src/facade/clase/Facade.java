
package facade.clase;

public class Facade {

    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        this.medic.adaugaPacient(new Pacient("Andreea",10));
        this.medic.adaugaPacient(new Pacient("Maria",5));
        this.medic.adaugaPacient(new Pacient("Stefan",3));
        this.salon = new Salon();
        this.salon.adaugaPat(123);
        this.salon.adaugaPat(124);
        this.salon.adaugaPat(125);
    }

    public void interogheazaPacient(String numePacient) {
        if(this.medic.verificareTrimitere(this.medic.getPacient(numePacient))) {
            if(salon.verificarePaturiLibere()) {
                if(medic.getPacient(numePacient).getGravitate() > 4){
                    System.out.println(numePacient + " este internat!");
                    salon.ocupaPat();
                }
                else
                {
                    System.out.println("Puteti sa mergeti acasa, nu e grav!");
                }
            }
            else
            {
                System.out.println("Nu avem paturi libere!");
            }
        }
        else
        {
            System.out.println("Aveti nevoie de trimitere de la medic!");
        }

    }

}
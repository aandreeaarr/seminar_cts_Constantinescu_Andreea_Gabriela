package clase;

public class StareOcupat implements IStare{
    @Override
    public void modificaStare(Loc loc) {
        if(loc.getStare() instanceof StareOcupat) {
            loc.setStare(this);
        }
    }
}

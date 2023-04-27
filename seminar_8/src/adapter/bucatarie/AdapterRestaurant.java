package adapter.bucatarie;

import adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftBucatarie {
    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalPlata) {
        super.printezaNotaBauturi(totalPlata);
    }
}
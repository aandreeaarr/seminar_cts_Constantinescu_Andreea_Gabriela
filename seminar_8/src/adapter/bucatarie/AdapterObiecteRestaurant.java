package adapter.bucatarie;

import adapter.bar.ISoftBar;
import adapter.bar.SoftBar;

public class AdapterObiecteRestaurant implements ISoftBucatarie {
    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        this.softBar.printezaNotaBauturi(totalPlata);
    }
}
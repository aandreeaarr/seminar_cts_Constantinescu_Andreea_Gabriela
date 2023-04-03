package singleton_registry.main;

import singleton_registry.clase.PachetCazare;
import singleton_registry.clase.PachetTransport;
import singleton_registry.clase.PachetTuristic;
import singleton_registry.clase.RegistryPachete;

public class Main {
    public static void main(String[] args) {
        PachetCazare cazare1 = new PachetCazare();
        PachetCazare cazare2 = new PachetCazare();
        PachetTransport transport = new PachetTransport();

        try{
            RegistryPachete.register("Cazare", cazare1);
            RegistryPachete.register("transport", transport);

            RegistryPachete.getPachet("Cazare").descriere();
            RegistryPachete.getPachet("transport").descriere();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package clase;

public interface IFarmacie {
    void aboneaza(IClient client);
    void dezaboneaza(IClient client);
    void trimiteNotificare(String notificare);
}

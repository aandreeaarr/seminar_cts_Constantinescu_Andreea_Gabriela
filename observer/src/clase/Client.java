package clase;

public class Client implements IClient{
    private String codClient;

    public Client(String codClient) {
        this.codClient = codClient;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(codClient+ " a primit o notificare " + mesaj);
    }
}

package observer.clase;

public interface ISpital {
    void abonare(IPacient pacient);
    void dezabonare(IPacient pacient);
    void notificarePacienti(String mesaj);
}

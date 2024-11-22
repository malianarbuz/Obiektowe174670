import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = Objects.requireNonNullElseGet(listaZamowien, ArrayList::new);
    }
    public void dodajZamowienie(Zamowienie zamowienie) {
        this.listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien() {
        for(Zamowienie zamowienie : listaZamowien) {
            zamowienie.wyswietlZamowienie();
        }
    }
    public double obliczLacznyKosztZamowien() {
        double suma=0;
        for(Zamowienie zamowienie : listaZamowien) {
            suma+=zamowienie.koszyk.obliczCalkowitaWartosc();
        }
        return suma;
    }

}

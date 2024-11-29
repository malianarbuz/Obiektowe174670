import java.util.ArrayList;

public class Klient {
    String Imie;
    String Nazwisko;
    ArrayList<Zamowienie> listaZamowien;
    Adres adres;

    public Klient(String Imie, String Nazwisko,Adres adres){
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.adres = adres;
        listaZamowien = new ArrayList<Zamowienie>();
    }
    public void dodajZamowiene(Zamowienie z){
        listaZamowien.add(z);
    }
    public void wyswietlHistorieZamowien() {
        for(Zamowienie z : listaZamowien){
            z.wyswietlZamowienie();
        }
    }
    public double obliczLacznyKosztZamowien() {
        double suma=0;
        for(Zamowienie z : listaZamowien){
            suma+=z.koszyk.obliczCalkowitaWartosc();
        }
        return suma;
    }
}

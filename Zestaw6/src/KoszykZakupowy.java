import java.util.ArrayList;
import java.util.Objects;

public class KoszykZakupowy {
    ArrayList<Produkt> listaZakupow;

    public KoszykZakupowy(ArrayList<Produkt> listaZakupow) {
        this.listaZakupow = Objects.requireNonNullElseGet(listaZakupow, ArrayList::new);
    }
    public void dodajProdukt(Produkt produkt) {
        if(produkt.iloscNaMagazynie>0) {
            produkt.iloscNaMagazynie--;
            listaZakupow.add(produkt);
        }
    }
    public void wyswietlZawartoscKoszyka() {
        for (Produkt produkt : listaZakupow) {
            System.out.println(produkt.nazwa+" "+"ilosc: 1\t");
        }
    }
    public double obliczCalkowitaWartosc() {
        double suma=0;
        for (Produkt produkt : listaZakupow) {
            suma+=produkt.cena;
        }
        return suma;
    }

}

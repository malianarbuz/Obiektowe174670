public class Zamowienie {
    KoszykZakupowy koszyk;
    String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszyk, String statusZamowienia) {
        this.koszyk = koszyk;
        this.statusZamowienia = statusZamowienia;
    }
    public void ustawStatusZamowienia(String status) {
        this.statusZamowienia = status;
    }
    public void wyswietlZamowienie() {
        this.koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Wartość Zamowienia:"+this.koszyk.obliczCalkowitaWartosc());
        System.out.println("Status Zamowienia: " + this.statusZamowienia+"\n");
    }
}

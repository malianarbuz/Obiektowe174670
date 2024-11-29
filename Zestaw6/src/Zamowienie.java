public class Zamowienie {
    KoszykZakupowy koszyk;
    String statusZamowienia;

    public Zamowienie(KoszykZakupowy k) {
        koszyk = k;
        statusZamowienia = "nowe";
    }
    public void ustawStatusZamowienia(String status){
        this.statusZamowienia = status;
    }
    public void wyswietlZamowienie(){
        this.koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Status Zamowienie : "+this.statusZamowienia+"\n");
    }
}

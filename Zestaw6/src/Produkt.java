public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public  void wyswietlInformacje() {
        System.out.println("Nazwa: " + this.nazwa+"\tCena: " + this.cena+"\t ilosc na Magazynie: " + this.iloscNaMagazynie);
    }
    public void dodajDoMagazynu(int ilosc){
        this.iloscNaMagazynie+=ilosc;
    }
    public void usunZMagazynu(int ilosc){
        if(this.iloscNaMagazynie>=ilosc)
        {this.iloscNaMagazynie-=ilosc;}
    }
}

public class Main{
    public static void main(String[] args) {

        Produkt produkt = new Produkt("Jajka",15,100);
        produkt.dodajDoMagazynu(10);
        produkt.usunZMagazynu(50);

        Produkt produkcik = new Produkt("Cebula",35,199);
        KoszykZakupowy kosz=new KoszykZakupowy();

        /*kosz.dodajProdukt(produkt);
        kosz.dodajProdukt(produkt);
        kosz.dodajProdukt(produkt);
        kosz.dodajProdukt(produkcik);
        kosz.dodajProdukt(produkcik);
        Zamowienie zamowienie=new Zamowienie(kosz);
        Klient klient=new Klient("Adi","Jaworek");
        klient.dodajZamowiene(zamowienie);
        klient.dodajZamowiene(zamowienie);
        Sklep sklep=new Sklep();
        sklep.dodajProdukt(produkt);
        sklep.dodajProdukt(produkcik);*/
        Magazyn magazyn=new Magazyn();
        magazyn.dodajProdukt(produkt,2);
        magazyn.dodajProdukt(produkt,5);
        magazyn.dodajProdukt(produkcik,3);
        magazyn.wyswietlAsortyment();
        Adres adres=new Adres("Sikorskiego","23","10-700","Nędznica");
        Adres adresw=new Adres("Sikorskiego","23","45","23,10-700","Nędznica");
        adres.pokaz();
        adresw.pokaz();
    }
}
public class Main {
    public static void main(String[] args) {
        Produkt produkcik=new Produkt("Akordeon",10.99,10);
        Produkt produkcik2=new Produkt("Widły",23.99,50);
        KoszykZakupowy koszyk=new KoszykZakupowy(null);
        KoszykZakupowy koszyk2=new KoszykZakupowy(null);
        koszyk.dodajProdukt(produkcik);
        koszyk.dodajProdukt(produkcik2);
        koszyk2.dodajProdukt(produkcik);
        koszyk2.dodajProdukt(produkcik);
        //koszyk.wyswietlZawartoscKoszyka();
        //System.out.println(koszyk.obliczCalkowitaWartosc());
        Zamowienie zamowienie=new Zamowienie(koszyk,"Nowe");
        Zamowienie zamowienie2=new Zamowienie(koszyk2,"Nowe");
        //zamowienie.wyswietlZamowienie();
        Klient klient=new Klient("Jarek","Kaczka",null);
        klient.dodajZamowienie(zamowienie);
        klient.dodajZamowienie(zamowienie2);
        klient.wyswietlHistorieZamowien();
        System.out.println(klient.obliczLacznyKosztZamowien());

    }
}
public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa,double cena,int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
    }

    public void dodajDoMagazynu(int i){
        iloscNaMagazynie += i;
    }

    public void usunZMagazynu(int i){
        if(i<=iloscNaMagazynie){
            iloscNaMagazynie -= i;
        }
        else{
            System.out.println("Za mało produktu na magazynie");
        }
    }
}


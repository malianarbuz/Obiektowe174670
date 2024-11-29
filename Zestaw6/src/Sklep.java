import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Sklep {
    HashMap<Produkt,Integer> produkty;
    private String nazwaSklepu;
    private Date dataPowstania;
    private Magazyn magazynSklepu;
    Sklep(String nazwaSklepu,Date dataPowstania,Magazyn magazynSklepu){
         this.produkty = magazynSklepu.getProdukty();
         this.nazwaSklepu = nazwaSklepu;
         this.dataPowstania = dataPowstania;
         this.magazynSklepu = magazynSklepu;
     }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        this.magazynSklepu = magazynSklepu;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }

    public Date getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(Date dataPowstania) {
        this.dataPowstania = dataPowstania;
    }

    public HashMap<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashMap<Produkt, Integer> produkty) {
        this.produkty = produkty;
    }

    public void wyswietlOferty(){
         this.magazynSklepu.wyswietlAsortyment();
     }
     public Produkt wyszukajProdukt(String nazwa){
         for(Produkt produkt:produkty.keySet()){
             if(Objects.equals(produkt.nazwa, nazwa))
                 return produkt;
         }
             return null;
     }
     public void zakupy(Klient klient,String produkt,int ilosc)
     {
         Produkt produktKlienta=wyszukajProdukt(produkt);
         ////////////
     }
}

import java.util.HashMap;

public class Magazyn {
    private HashMap<Produkt,Integer> produkty;

    public Magazyn()
    {
        produkty=new HashMap<>();
    }

    public HashMap<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashMap<Produkt, Integer> produkty) {
        this.produkty = produkty;
    }
    public void dodajProdukt(Produkt produkt,int ilosc){
        if(!produkty.containsKey(produkt)){
            produkty.put(produkt,ilosc);
        }
        else{
            int temp=produkty.get(produkt)+ilosc;
            produkty.put(produkt,temp);
        }

    }
    public void wyswietlAsortyment(){
        for(Produkt produkt:produkty.keySet()){
            produkt.wyswietlInformacje();
            System.out.println("Ilosc: "+produkty.get(produkt)+"\n");
        }

    }
}

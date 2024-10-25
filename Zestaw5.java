import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        String napis="bcadefjyht";
        int liczba=234523569;
        numbers.add(1);
        numbers.add(2);
        numbers2.add(20);
        numbers2.add(20);
        numbers2.add(8);
        numbers2.add(-3);
        mergeSorted(numbers,numbers2);
        System.out.println(numbers);
        System.out.println(toArrayList(napis));
        System.out.println(toArrayList(liczba));
        ArrayList<ArrayList<Integer>>arr=uniqueArrayList(numbers);
        System.out.println(numbers);
        System.out.println(arr);
    }
    static void append(ArrayList<Integer>  tab1, ArrayList<Integer>  tab2) {
        tab1.addAll(tab2);
    }
    static void mergeSorted(ArrayList<Integer>  tab1,ArrayList<Integer>  tab2) {
        append(tab1,tab2);
        Collections.sort(tab1);
    }
    static ArrayList<String> toArrayList(String napis) {
    ArrayList<String> arr= new ArrayList<>();
    for(int i=0;i<napis.length();i++) {
        arr.add(napis.substring(i,i+1));
    }
    Collections.sort(arr);
    return arr;
    }
    static ArrayList<String> toArrayList(int liczba) {
        ArrayList<String> arr= new ArrayList<>();
        String napis=Integer.toString(liczba);
        for(int i=0;i<napis.length();i++) {
            arr.add(napis.substring(i,i+1));
        }
        Collections.sort(arr);
        return arr;
    }
    static boolean checkChar(ArrayList<String> tab,char znak) {
        String str=String.valueOf(znak);
        for (String s : tab) {

            if (s.equals(str)) {
                return true;
            }

        }
        return false;
    }
    static boolean checkDigit(ArrayList<Integer> tab,int  cyfra) {
        for (Integer integer : tab) {
            if (integer == cyfra)
                return true;
        }
        return false;
    }
    static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();

        for (int i=1;i<tab.size();i++) {
                ArrayList<Integer> temp= new ArrayList<>();
                for(int j=0;j<arr.size();j++) {

                }
        }
        return arr;
    }
}
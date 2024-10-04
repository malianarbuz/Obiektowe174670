import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String ImieNazwisko= new String("Michał Dobrowolski");
        System.out.println(ImieNazwisko);
        System.out.println(ImieNazwisko.length());
        String Str1=new String("Ala");
        String Str2=new String("ma");
        String Str3=new String("kota");
        System.out.println(Str1+Str2+Str3);
        System.out.println(
                "         (1)         \n"+
                "                    *\n" +
                "                    * *\n" +
                "                    * * *\n"+
                "* * * * * * * * * * * * * *\n" +
                "* * * * * * * * * * * * * * *\n"+
                "* * * * * * * * * * * * * *\n"+
                "                    * * *\n"+
                "                    * *\n"+
                "                    *\n");

        System.out.println(
                        "    (2)\n"+
                        "     *\n"+
                        "    * *\n"+
                        "   * * *\n"+
                        "  * * * *\n"+
                        " * * * * *\n"+
                        "* * * * * *\n"+
                        " * * * * *\n"+
                        "  * * * *\n"+
                        "   * * *\n"+
                        "    * *\n"+
                        "     *\n"

        );
        String Str4=new String("Ala ma kota");
        System.out.println(Str4.replace("a","e"));
        System.out.println(Str4.toUpperCase());
        System.out.println(Str4.toLowerCase());
        System.out.println( (int) 'A');
        System.out.println( (int) '!');
        System.out.println( (int) '@');
        System.out.println( (int) '~');
        System.out.println( (int) '\b');
        System.out.println( (int) '\n');

        System.out.println( "Małe Litery "+ (int) 'a' +"-"+ (int) 'z');
        System.out.println( "Duże Litery "+ (int) 'A' +"-"+ (int) 'Z');
        System.out.println( "Cyfry "+ (int) '0' +"-"+ (int) '9');

        System.out.println("Grzesiek nie wiedział dlaczego ogórek jest tak drapieżnym warzywem mimo, że jego kolor na to nie wskazuje");
        for(int i=0;i<5;i++)
        {
            System.out.print("wodrze ");
        }
        System.out.println();
        System.out.println("Dzisiaj jest "+ LocalDate.now()+" godzina "+ LocalTime.now());

        System.out.println( (char) 54);
        System.out.println( (char) 103);
        System.out.println( (char) 241);
        System.out.println( (char) 67);
        System.out.println( (char) 9999);
        System.out.println( (char) ImieNazwisko.length());
        System.out.println( (char) 174670);
    }
}
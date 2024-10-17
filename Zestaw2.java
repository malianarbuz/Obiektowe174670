import java.util.Scanner;

public class Zestaw2 {
    public static void zestaw2() {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("23.0+76 = "+(23.0+76)+" "+((Object)(23.0+76)).getClass());
        System.out.println("41*2.0+3 = "+(41*2.0+3)+" "+((Object)(41*2.0+3)).getClass());
        System.out.println("5-33 = "+(5-33)+" "+((Object)(5-33)).getClass());
        System.out.println("109%3 = "+(109%3)+" "+((Object)(109%3)).getClass());
        System.out.println("50/2 = "+(50/2)+" "+((Object)(50/2)).getClass());
        System.out.println("4|2 = "+(4|2)+" "+((Object)(4|2)).getClass());
        System.out.println("3^5 = "+(3^5)+" "+((Object)(3^5)).getClass());
        System.out.println("7&9 = "+(7&9)+" "+((Object)(7&9)).getClass());

        //2
        double w1= (Math.sqrt(7)-1)/2+(Math.pow(3,3)%2);
        double w2= (double) 2003 /(22*9);
        double w3= (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        double w4=7%5%3;
        System.out.println((int)w1);
        System.out.println((int)w2);
        System.out.println((int)w3);
        System.out.println((int)w4);

        //3
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1);
        System.out.println(str2);

        //4
        double l1=Double.parseDouble(sc.nextLine());
        double l2=Double.parseDouble(sc.nextLine());
        System.out.println("Suma :"+l1+"+"+l2+"="+ (l1+l2));
        System.out.println("Różnica :"+l1+"+"+l2+"="+ (l1-l2));
        System.out.println("Iloczyn :"+l1+"+"+l2+"="+ (l1*l2));
        System.out.println("Iloraz :"+l1+"+"+l2+"="+ (l1/l2));

        //5
        double x=Double.parseDouble(sc.nextLine());
        System.out.println(x+140);
        System.out.println(x-31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println((int)x/4);
        System.out.println(Math.pow(x,45));
        System.out.println((int)x&67);
        System.out.println((int)x|59);
        System.out.println((int)x^23);
        System.out.println((int)x<<5);
        System.out.println((int)x>>6);
    }
}

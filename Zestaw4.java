import java.util.Random;

public class Zestaw4 {
    public static void main(String[] args) {
        int[] arr=generujZakres(3,1,9);
        wypiszTablice(arr,3,3);
        System.out.println(sredniaGeometryczna(arr));
        int[] arr2=funkcjaLiniowa(arr,4,5);
        wypiszTablice(arr2,3,3);
    }
    public static int[] generujTablice(int n,int minWartosc,int maxWartosc)
    {
        Random rand = new Random();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=rand.nextInt(maxWartosc-minWartosc+1)+minWartosc;

        }
        return arr;
    }
    public static void wypiszTablice(int[] tab,int n,int m)
    {
       int count=0;
        for (int i=0;i<n;i++) {
            for(int j=0;j<m;j++,count++) {
                if(count<tab.length) {
                    System.out.print(" " + tab[count] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static int ileNieparzystych(int[] tab)
    {
        int counter=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]%2!=0)
            {
                counter++;
            }
        }
        return counter;
    }
    public static int ileParzystych(int[] tab)
    {
        int counter=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]%2==0)
            {
                counter++;
            }
        }
        return counter;
    }
    public static int ileDodatnich(int[] tab)
    {
        int counter=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                counter++;
            }
        }
        return counter;
    }
    public static int ileUjemnych(int[] tab)
    {
        int counter=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
            {
                counter++;
            }
        }
        return counter;
    }
    public static int ileZerowych(int[] tab)
    {
        int counter=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==0)
            {
                counter++;
            }
        }
        return counter;
    }
    public static int ileMaxymalnych(int[] tab)
    {
        int counter=0;
        int max=tab[0];
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>max)
            {
                max=tab[i];
                counter=1;
            }
            else if(tab[i]==max){
                counter++;
            }
        }
        return counter;
    }
    public static int ileMinimalnych(int[] tab)
    {
        int counter=0;
        int min=tab[0];
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<min)
            {
                min=tab[i];
                counter=1;
            }
            else if(tab[i]==min){
                counter++;
            }
        }
        return counter;
    }
    public static int ileUnikalnych(int[] tab)
    {
        int counter=tab.length;
        int element;
        for(int i=0;i<tab.length;i++)
        {
            element=tab[i];
            for(int j=0;j<tab.length;j++) {

                if(tab[j]==element && i!=j ){
                counter--;
                break;
                }
            }
        }
        return counter;
    }
    public static int sumaDodatnich(int[] tab)
    {
        int sum=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                sum+=tab[i];
            }
        }
        return sum;
    }
    public static int sumaUjemnych(int[] tab)
    {
        int sum=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
            {
                sum+=tab[i];
            }
        }
        return sum;
    }
    public static double sumaOdwrotnosci(int[] tab)
    {
        double sum=0;
        for(int i=0;i<tab.length;i++)
        {
            sum+= (double) 1 /tab[i];
        }
        return sum;
    }
    public static double sredniaArytmetyczna(int[] tab)
    {
        double sum=0.;
        for(int i=0;i<tab.length;i++)
        {
            sum+= (double) 1 /tab[i];
        }
        return sum/tab.length;
    }
    public static double sredniaGeometryczna(int[] tab)
    {
        double iloczyn=1;
        for(int i=0;i<tab.length;i++)
        {
            iloczyn*=tab[i];
        }
        return Math.pow(iloczyn, (double) 1 /tab.length);
    }
    public static double sredniaHarmoniczna(int[] tab)
    {
        double sum=0;
        for(int i=0;i<tab.length;i++)
        {
            sum+= (double) 1 /tab[i];
        }
        return tab.length/sum;
    }
    public static int[] funkcjaLiniowa(int[] tab,int a,int b)
    {
        int[] resultTab=new int[tab.length];
        for (int i=0;i<tab.length;i++) {
            resultTab[i]=a*tab[i]+b;
        }
        return resultTab;
    }
    public static int[] funkcjaKwadratowa(int[] tab,int a,int b,int c)
    {
        int[] resultTab=new int[tab.length];
        for (int i=0;i<tab.length;i++) {
            resultTab[i]=a*(int)Math.pow(tab[i],2)+b*tab[i]+c;
        }
        return resultTab;
    }
    public static int[] funkcjaLiniowa(int[] tab,int a)
    {
        int[] resultTab=new int[tab.length];
        for (int i=0;i<tab.length;i++) {
            resultTab[i]=(int)Math.pow(a,tab[i]);
        }
        return resultTab;
    }
    public static int[] funkcjaSignum(int[] tab)
    {
        int[] resultTab=new int[tab.length];
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                resultTab[i]=1;
            }
            else if(tab[i]==0){
                resultTab[i]=0;
            }
            else{
                resultTab[i]=-1;
            }
        }
        return resultTab;
    }




    public static int[] generujZakres(int n,int minWartosc,int maxWartosc)
    {
        //nie dziala
        Random rand = new Random();
        int zakres=maxWartosc/minWartosc;
        System.out.println(zakres);
        int a=(maxWartosc-minWartosc+1)/zakres;
        System.out.println(a);
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=rand.nextInt()+minWartosc;

        }
        return arr;

    }
}
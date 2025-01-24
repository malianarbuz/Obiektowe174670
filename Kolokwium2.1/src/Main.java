import java.util.Objects;

public class Main {
    public static void main(String[] args) {
    String a="2";
    String b="2";
        System.out.println(isEqualOrNull(a,b));

    }
    public static <T> Object isEqualOrNull(T object1, T object2)
    {
        if((object1==null && object2==null) || (Objects.equals(object1, object2)))
            return true;
        return null;
    }
}
package ReturnTypes;

/**
 * Created by ronald on 20/11/16.
 */
public class Banana {
    public static void main(String[] args) {
        System.out.printf("%s", juicy("Jacob", "Lucy", "Abraham"));
        System.out.printf("%s", juicy(100, 104, 108));
    }

    public static <T extends Comparable<T>> T juicy(T a, T b, T c) {
        T m = a;

        if (b.compareTo(a) > 0)
            m = b;
        if (c.compareTo(m) > 0)
            m = c;
        return m;
    }
}

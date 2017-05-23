package BoundedTypes;

/**
 * Created by ronald on 19/11/16.
 */
public class Pyramid<T extends Number> {
    T[] nums;

    // extends Number works on the intValue() method that gets called.

    public Pyramid(T[] nums) {
        this.nums = nums;
    }

    public int average() {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].intValue();
        return (sum / nums.length);
    }

    boolean sameAvg(Pyramid<T> ob) {
        // You don't have to use the wildcard "<?>", but if you don't, you can only use numbers eg. floats, integers,
        // and double of the SAME type in main!! That's what we mean by bounded types!!!
        if (average() == ob.average())
            return true;
        return false;
    }

    public static void main(String[] args) {

        Integer[] salt = {7, 8, 9};
        Pyramid<Integer> x = new Pyramid<>(salt);
        System.out.println((int)x.average());

        Integer [] pepper = {20, 88,99};
        Pyramid<Integer> y = new Pyramid<>(pepper);
        System.out.println((int)y.average());


        // See which arrays have same average.
        System.out.print("Averages of iob and ijb ");
        if (x.sameAvg(y)) {
            System.out.println("are the same.");
        } else
            System.out.println("differ.");

    }
}


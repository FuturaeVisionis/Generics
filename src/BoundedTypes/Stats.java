package BoundedTypes;

/**
 * Created by ronald on 17/11/16.
 */
public class Stats<T extends Number> {
    T[] nums;


    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    // Determine whether the two averages are the same:
    // NOT A <T>, BUT A <?>!! <-- <-- <-- <-- <-- WILDCARD.
    // You need the wildcard, because Integers cannot be compared with doubles
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
            return false;
        }

        /*
        The trouble with just<T> is that it will work only with other Stats objects whose type is the same as the
        invoking object. For example, if the invoking object is of type Stats<Integer>, then the parameter ob must also
        be of type Stats<Integer>. It can’t be used to compare the average of an object of type Stats<Double> with the
        average of an object of type Stats<Short>, for example. Therefore, this approach won’t work except in a very
        narrow context and does not yield a general (that is, generic) solution. To create a generic sameAvg( ) method,
        you must use another feature of Java generics: the wildcard argument. The wildcard argument is specified by the
        ?, and it represents an unknown type. Using a wildcard, here is one way to write the sameAvg( ) method:
         */

    public static void main(String[] args) {

        Integer inums[] = {1};
        Stats<Integer> iob = new Stats<>(inums);
        System.out.println(iob.average());

        Double apple[] = {1.0, 7.0};
        Stats<Double> ijb = new Stats<>(apple);
        System.out.println(ijb.average());

        Float color [] = {20.58F, 55.1125F};
        Stats <Float> bilbo = new Stats <> (color);
        System.out.println(bilbo.average());


        // See which arrays have same average.
        System.out.print("Averages of iob and ijb ");
        if(iob.sameAvg(ijb)) {
            System.out.println("are the same.");
        }
        else
            System.out.println("differ.");

    }
}


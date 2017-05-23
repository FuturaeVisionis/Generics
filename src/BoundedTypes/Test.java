package BoundedTypes;

/**
 * Created by ronald on 19/11/16.
 */
    public class Test<Integer extends Number> {
        Integer[] nums;

        // -> -> -> You can replace the T with let's say an Integer. The Integer then extends Numbers, right?
        // This means the extension can be anything but a Integer! Check out main method.

        public Test(Integer[] nums) {
            this.nums = nums;
        }

        public int average() {
            int sum = 0;
            for (int i = 0; i < nums.length; i++)
                sum += nums[i].intValue();
            return (sum / nums.length);
        }

        boolean sameAvg(Test<Float> ob) { // I can Float, but not Double. This is strange, but true!
            if (average() == ob.average())
                return true;
            return false;
        }

        public static void main(String[] args) {

            Float [] pepper = {20.23F, 88.25F,99.25F};
            Test<Float> y = new Test<>(pepper);
            System.out.println(y.average());

            Double[] salt = {7.20, 8.52, 9.398};
            Test<Double> x = new Test<>(salt);
            System.out.println(x.average());


        /*The code below won't compile, because the Integer is not part of the bounded types. The bounded type are
        all Numbers excluding Integers. Why? You declared Integers as extending Numbers!!

        ## YOU CAN BYPASS THIS PROBLEM, BY LOOKING AT THE STATS CLASS ##

        Integer[] delta = {1,2,5};
        Stats<Integer> force = new Stats<>(delta);
        System.out.println((int)force.average());

        */

            // See which arrays have same average.
            System.out.print("Averages of iob and ijb ");
            if (x.sameAvg(y)) {
                System.out.println("are the same.");
            } else
                System.out.println("differ.");

        }
    }


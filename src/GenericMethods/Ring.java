package GenericMethods;

/**
 * Created by ronald on 20/11/16.
 */
public class Ring {
    public static void main(String[] args) {

        Integer[] bilbo = {1, 2, 3, 4};
        Character[] baggins = {'L', 'o', 'r', 'd'};

        findMe(bilbo);
        findMe(baggins);

    /*
    // I CAN EITHER OVERLOAD THE METHODS OR CHOOSE TO USE ONE GENERIC METHOD

    }
    public static void findMe(Integer[] i){
        for (Integer x : i)
            System.out.printf("%s", x);
        System.out.println();
    }
    public static void findMe(Character[] i){
        for (Character y : i)
            System.out.printf("%s", y);
    }
    */
        //BUT THE COOL THING IS THAT THE GENERIC METHOD IS A METHOD THAT FITS ALL!! CHECK OUT THE CODE BELOW!
    }
    public static <T> void findMe(T[] b){
    for (T x : b)
        System.out.printf("%s", x);

    }
}

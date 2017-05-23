package Creta;


/**
 * Created by ronald on 13/11/16.
 */
public class Generics {

    private static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intarray = {10, 20, 30, 40, 50};
        Character[] chararray = {'J', 'A', 'V', 'A'};

        System.out.println("Printing integer array");
        printArray(intarray);

        System.out.println("Printing char array");
        printArray(chararray);
    }
}

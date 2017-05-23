package Enterprise;


import java.util.ArrayList;

/**
 * Created by ronald on 19/11/16.
 */
public class Animals {


    public static void main(String[] args) {

        ArrayList<String> pets = new ArrayList<>();
        pets.add("mouse");
        pets.add("dog");
        pets.add("cat");

        String animals = pets.get(2);

        System.out.println(animals);


    }
}
/*
ArrayList pets = new ArrayList<>();
        pets.add("mouse");
        pets.add("dog");
        pets.add(400);
        pets.add("cat");

        int animals = (int) pets.get(2);


        System.out.println(animals);

 */



package Enterprise;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ronald on 19/11/16.
 */
public class Porcupine<T extends String> {
    T[] types;

    public Porcupine(T[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return Arrays.toString(types);
    }

    public String myPets(String a) {
        System.out.print("Hamster, " + "dog, " + "cat");
        return a;
    }

    public String yourPets() {

        ArrayList<String> pets = new ArrayList<>();
        pets.add(" Also a mouse, ");
        pets.add("donkey, ");
        pets.add("and fish.");

        for (String delta : pets)
            System.out.print(delta);

        return "rabbit.";
    }

    public static void main(String[] args) {

        String[] nucleus = {"monkey", "snail", "and tortoise"};

        System.out.println("My pets are:");

        Porcupine<?> x = new Porcupine<>(nucleus);
        System.out.print(x.myPets(" and a " + x.toString()));
        System.out.print(" And my favourite is the old " + x.yourPets());


    }
}

package Delta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronald on 15/11/16.
 */
public class PayPall {
    public static void main(String[] args) {


        GroceryStore store = new GroceryStore();

        List<? super GroceryStore.Fruit> fruitsBasket = new ArrayList<>();

        store.fill(fruitsBasket);

        assert (fruitsBasket.size() == 3);

        List<GroceryStore.Apple> anotherBasket = new ArrayList<>();
        anotherBasket.add(new GroceryStore.Apple("apple", 5, "US"));
        anotherBasket.add(new GroceryStore.Apple("apple", 8, "UK"));
        anotherBasket.add(new GroceryStore.Apple("apple", 9, "CN"));

        assert (store.getBiggestFruit(anotherBasket).

                getSize() == 9);

        System.out.println(store.getBiggestFruit(anotherBasket));
    }
}



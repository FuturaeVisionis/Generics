package Delta;

import java.util.List;

/**
 * Created by ronald on 15/11/16.
 */
public class GroceryStore {

    static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Fruit extends Plant {
        private int size;

        public Fruit(String name, int size) {
            super(name);
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    static class Apple extends Fruit {
        private String origin;

        public Apple(String name, int size, String origin) {
            super(name, size);
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }
    }
    public void fill(List<? super Fruit> fruitsBasket) {
        fruitsBasket.add(new Apple("apple", 5, "US"));
        fruitsBasket.add(new Apple("apple", 8, "UK"));
        fruitsBasket.add(new Apple("apple", 9, "CN"));
    }

    public Fruit getBiggestFruit(List<? extends GroceryStore.Fruit> fruits) {
        assert (!fruits.isEmpty());
        int len = fruits.size();

        Fruit biggestFruit = fruits.get(0);
        int i;
        for (i = 1; i < len; i++) ;
        if (fruits.get(i).getSize() > biggestFruit.getSize()) {
            biggestFruit = fruits.get(i);

        }

        return biggestFruit;
    }
}




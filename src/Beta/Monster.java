package Beta;

/**
 * Created by ronald on 17/11/16.
 */
class Monster<T> {
    T green; // declaring an object of the type "T".

    public Monster(T green) { // constructor
        this.green = green;
    }

    public static void main(String[] args) {

        Monster<?> iOb = new Monster<>(88);
        iOb.showType();
        System.out.println("Value: " + iOb.getGreen());

        Monster<String> strOb = new Monster<>("String");
        strOb.showType();
        System.out.println("Value: " + strOb.getGreen());

        Monster<Double> dbOb = new Monster<>(12.33);
        dbOb.showType();
        System.out.println("Value: " + (Double)dbOb.getGreen());
    }

    public T getGreen() { // normal return method
        return green; // must return the declared object!!
    }

    public void showType() { // normal void method
        System.out.println("Type of T is: " + green.getClass().getName());
    }
}

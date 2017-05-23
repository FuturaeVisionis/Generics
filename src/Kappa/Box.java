package Kappa;

/**
 * Created by ronald on 07/05/2017.
 */
public class Box<T> {

    private T t;


    public void add(T t) { //This is a method, that accepts a variable of class any Type!
        this.t = t;
    }

    public T getT() { // This is a getter method of private T.
        return t;
    }


    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value : %d\n\n", integerBox.getT());
        System.out.printf("String Value : %s\n", stringBox.getT());
    }
}
package Epsilon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronald on 15/11/16.
 */
public abstract class Shape {

    abstract void draw();

    abstract void colour();

}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing rectangle");

    }

    @Override
    void colour() {
        System.out.println("Colouring Rectangle.");

    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circle");
    }

    @Override
    void colour() {
        System.out.println("Colouring Circle");

    }
}
class Square extends Circle{
    void draw() {
        System.out.println("I like square shaped figures.");
    }
    void colour(){
        System.out.println("Colouring square.");
    }
}

class GenericTest {
    // creating a method that accepts only a child class of shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
            s.colour();
        }
   }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());
        drawShapes(list1);

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        drawShapes(list2);

        List<Square> list3 = new ArrayList<>();
        list3.add(new Square());
        drawShapes(list3);
    }
}


package Beta;

import javax.lang.model.element.Element;

/**
 * Created by ronald on 13/11/16.
 */
public class MyGen<T> {
    T obj;

    //void add(T obj){
        //this.obj = obj;
    //}

    ///*

    public MyGen(T obj) {
        this.obj = obj;
    }
//*/
    T get() {
        return obj;
    }

    public static void main(String[] args) {
        MyGen<?> m = new MyGen<>("hello world");
        //m.add(6);
        System.out.println(m.get());
    }
}


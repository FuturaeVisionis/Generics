package Beta;


/**
 * Created by ronald on 13/11/16.
 */
public class Genes <T> {

    T a = (T) "yellow"; // casting a to a String. You need to do this, because T = something.

    public void apple(T a){
        System.out.println(this.a);
        this.a = a;

    }
    public T orange(T a){
        System.out.println(a);
        return a;

    }

    public static void main(String[] args) {
        Genes <String> fruit = new Genes<>();
        fruit.apple("Red");
        fruit.orange("brown");
    }
}

/*

YOU CAN ALSO USE THE CODE BELOW, BUT THAT'S WITHOUT GENERICS!!

public class Genes {
String a = "yellow";

public void apple (String a){
system.out.println(a);
this.a = a;

}
public String orange(String a){
system.out.println(a)

}
public static void main(String[] args) {
Genes genes = new Genes();
genes.apple("green");
genes.orange("brown");
}}
*/

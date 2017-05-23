package Beta;

/**
 * Created by ronald on 13/11/16.
 */
public class Bunny {

    String a = "yellow";

    public static void main(String[] args) {
        Bunny genes = new Bunny();
        genes.apple("jason");
        genes.orange("brown");
    }

    public void apple(String a) {
        System.out.println(this.a);
        this.a = a;

    }

    public String orange(String a) {
        System.out.println(a);
        return a;
    }
}

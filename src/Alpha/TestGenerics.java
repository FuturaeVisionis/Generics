package Alpha;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ronald on 13/11/16.
 */
public class TestGenerics {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(); // using generics eg. <Integer, String>
        map.put(1, "Joe");
        map.put(2, "Charles");
        map.put(3, "Orion");
        map.put(5, "Shelly");

        System.out.println("The first way using set and iterator:");

        Set<Map.Entry<Integer, String>> set = map.entrySet(); // walk through the map using entries
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next(); // no need to typecast. You are using generics!!
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("The second way using lambda:");

        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("The third way using enhanced for loop:");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}

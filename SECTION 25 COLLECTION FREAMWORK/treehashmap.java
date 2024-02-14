import java.util.*;
import java.util.Map.*;

public class treehashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>(Map.of(5, "e"));
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        // Entry<Integer, String> e = map.firstEntry();

        // System.out.println(e.getKey() + " " + e.getValue());
        System.out.println(map);

        // TreeMap<Integer, String> map = new TreeMap<Integer, String>(Map.of(5, "e"));
        // map.put(1, "a");
        // map.put(2, "b");
        // map.put(3, "c");
        // map.put(4, "d");

        // Entry<Integer, String> e = map.firstEntry();

        // System.out.println(e.getKey() + " " + e.getValue());
        // System.out.println(map);
    }
}

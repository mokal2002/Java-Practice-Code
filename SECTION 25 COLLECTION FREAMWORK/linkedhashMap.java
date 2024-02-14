import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(5, .75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 5;
            }
        };
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(9, "i");
        map.put(10, "j");
        map.get(2);
        map.get(3);
        System.out.println("Clone :" + map.clone());

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}

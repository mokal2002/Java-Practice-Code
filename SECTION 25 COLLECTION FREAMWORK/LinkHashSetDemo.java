import java.util.*;

public class LinkHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>(10);

        set.add("a");
        set.add("h");
        set.add("b");
        set.add("i");

        set.forEach(System.out::println);

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

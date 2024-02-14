import java.util.Arrays;

public class ArrayNdCompatetors {
    public static void main(String[] args) {
        int[] a = { 1, 5, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 1, 9, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] c = Arrays.copyOf(a, a.length);
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        // Arrays.fill(c, 10) ;
        Arrays.sort(c);
        // System.out.println(Arrays.compare(a, b));
        for (var x : c) {
            System.out.println(x);
        }
    }
}

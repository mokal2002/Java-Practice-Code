import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(100);
        dq.offerLast(13);
        dq.offerLast(130);
        dq.pollFirst();
        dq.pollLast();
        // System.out.println(dq);
        dq.forEach((x)->System.out.println(x));
    }
}

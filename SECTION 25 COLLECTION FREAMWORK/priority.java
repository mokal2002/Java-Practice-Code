import java.util.Comparator;
import java.util.PriorityQueue;
class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2){
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}
public class priority {

    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>(new MyCom());
        p.add(10);
        p.add(3);
        p.add(34);
        p.add(98);
        p.poll();
System.out.println(p.peek());
        p.forEach((x)->System.out.println(x));
    }
}

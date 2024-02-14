import java.util.TreeSet;

class Point implements Comparable {
    int x; // x coordinate
    int y; // y coordinate

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if (this.x < p.x)
            return -1;
        else if (this.x > p.x)
            return 1;
        else {
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0;
        }

    }

}

public class treeset {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 10, 50));
        // ts.add(25);
        // ts.add(23);
        // ts.add(2);
        // System.out.println(ts.ceiling(44));
        // System.out.println(ts.contains(33));
        // System.out.println(ts.isEmpty());

        // Comparible
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 2));
        ts.add(new Point(2, 3));
        ts.add(new Point(3, 4));
        ts.add(new Point(4, 5));
        System.out.println(ts);

    }
}

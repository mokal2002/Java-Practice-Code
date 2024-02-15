class Outer {
    int x = 10;
    Inner inner = new Inner();

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {
        // Inner inner = new Inner();
        inner.innerDisplay();
        System.out.println(inner.y);
    }

}

public class innerclasses {
    public static void main(String[] args) {
        // Outer o = new Outer();
        // o.outerDisplay();
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
        // oi.outerDisplay(); // outer display

    }
}

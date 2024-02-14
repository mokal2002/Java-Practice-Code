class student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float avrage() {
        return (float) total() / 3;
    }

    public char grade() {
        if (avrage() >= 60)
            return 'A';
        else
            return 'B';
    }
}

public class student110 {
    public static void main(String[] args) {
        student s = new student();
        s.roll = 1;
        s.name = "aniket";
        s.course = "cs";
        s.m1 = 111;
        s.m2 = 54;
        s.m3 = 45;

        System.out.println("Total  " + s.total());
        System.out.println("Avrage  " + s.avrage());
        System.out.println("Grade  " + s.grade());
        // System.out.println("");
        // System.out.println("");
        // System.out.println("");

    }
}

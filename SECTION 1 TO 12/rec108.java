class rec {
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSqure(){
        return length==breadth;
    }

}

public class rec108 {
    public static void main(String[] args) {
        
        rec r1=new rec();
        r1.length=2;
        r1.breadth=3;

        System.out.println("area : "+r1.area());        
        System.out.println("perimeter : "+r1.perimeter());
        System.out.println("sSqure : "+r1.isSqure());

    }
}

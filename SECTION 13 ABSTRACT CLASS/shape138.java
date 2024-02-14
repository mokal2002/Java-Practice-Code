abstract class shape {
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape {
    double radious;
    public double perimeter(){
        return 2*Math.PI*radious;

    }
    public double area(){
        return Math.PI*radious*radious;
    }
}

public class shape138 {
    public static void main(String[] args) {
        shape s=new circle();

    }
}

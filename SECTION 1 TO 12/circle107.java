class circle{
    public double radious;

    public double area(){
        return Math.PI *radious*radious;
    }
    public double parimeter(){
        return 2*Math.PI*radious;
    }
    public double cir(){
        return parimeter();
    }
}


public class circle107 {
    public static void main(String[] args) {
        circle c1=new circle();

        c1.radious=7;

        System.out.println("area : " +c1.area() );
        System.out.println("parmitere : "+c1.parimeter());
        System.out.println("cir : "+ c1.cir());

    }
}
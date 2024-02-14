class DataHide {
    private double length;
    private double breadth;


    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    +
    public void setLength(double l){
        if(l>=0)
            length=l;
        else
            length=0;
    }

    public void setBreadth(double b){
        if(b>=0)
            breadth=b;
        else
            breadth=0;
    }

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

public class datahinding112 {
    public static void main(String[] args) {
        DataHide r1=new DataHide();
        r1.setLength(12);
        r1.setBreadth(45);

        System.out.println("area : "+r1.area());        
        System.out.println("perimeter : "+r1.perimeter());
        System.out.println("sSqure : "+r1.isSqure());
    }
}

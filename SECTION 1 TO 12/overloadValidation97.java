public class overloadValidation97 {

    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    static double area(double length,double breadth)
    {
        return length*breadth;
    }

    static int reverse(int n)
    {
        int rev=0;
        
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        // System.out.println(area(2));
        // System.out.println(area(12,7));
        // int rev=reverse(903);
        System.out.println(reverse(123));



    }
}

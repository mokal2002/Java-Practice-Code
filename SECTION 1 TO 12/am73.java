import java.util.Scanner;

public class am73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n=sc.nextInt();
       int m=n;
       int sum=0;
       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;
        
        sum=sum+r*r*r;
       }
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armsttrong Number");


        // count digits
        // int count=0;
        // while (n>0) {
        //     n=n/10;
        //     count++;

        // }
        // System.out.println("Count is "+count);





        //rev
        // int r;
        // while(n>0){
        //     r=n%10;
        //     n=n/10;
        //     System.out.print(r);
        }
    }


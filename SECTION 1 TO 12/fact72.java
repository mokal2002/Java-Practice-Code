import java.util.Scanner;

public class fact72 {
    public static void main(String[] args) {
        // table
        // int n=5;

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("5 X "+i+"="+ n*i);
        // }


        //find a n number
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter A Number : ");
        // int n=sc.nextInt();
        // int sum=0;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println("Sum of "+ n+ "Number is "+sum);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n=sc.nextInt();
        int fact=1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("fact of "+n+ " Fact is "+fact);

    }
}

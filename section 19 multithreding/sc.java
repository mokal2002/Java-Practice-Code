class ATM {
    synchronized public void checkBalance(String name){
        System.out.println(name + "Checking");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name,int amount){
        System.out.println(name + "Withdrawing");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    Customer(String n, ATM a, int amt){
        name=n;
        atm=a;
        amount=amt;
    }

    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);

    }
    public void run(){
        useATM();
    }
}

public class sc {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
    }
    
}

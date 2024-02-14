// class t extends Thread {
//     public void run(){
//         int i=1;
//         while (true) {
//             System.out.println(i +"hello");
//             i++;
//         }
//     }
    
// }

// public class mythread extends Thread {
    public class mythread implements Runnable {

    public void run(){
        int i=1;
        while (true) {
            System.out.println(i +"hello");
            i++;
        }
    }
    public static void main(String[] args) {
        // t t=new t();
        mythread t =new mythread();
        Thread th=new Thread(t);
        th.start();
        int i=1;
        while (true) {
            System.out.println(i+"world");
            i++;
            
        }

    }
    
}

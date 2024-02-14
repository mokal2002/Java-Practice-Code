import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socketecho {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        } while (!msg.equals("dne"));
    }
}

class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.0.105", 2000);

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());

        String msg;

        do {
            msg = key.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From Server : " + msg);
        } while (!msg.equals("dne"));
    }
}
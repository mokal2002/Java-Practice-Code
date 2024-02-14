import java.io.FileInputStream;
import java.io.IOException;

public class fileinputstream {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis=new FileInputStream("C:/Users/swapn/Desktop/java/text.txt"))
        {
            // byte b[]=new byte[fis.available()];
            // fis.read(b);
            // String str=new String(b);
            // System.out.println(str);

            int x;
            while ((x=fis.read())!=-1) {
                System.out.print((char)x);
            }
        }
    }
}

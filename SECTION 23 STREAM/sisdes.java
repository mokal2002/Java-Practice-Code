import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sisdes {
    public static void main(String[] args) {
        try {
            FileInputStream fis1=new FileInputStream("C:/Users/swapn/Desktop/java/SECTION 23 STREAM/source1.txt");
            FileInputStream fis2=new FileInputStream("C:/Users/swapn/Desktop/java/SECTION 23 STREAM/source2.txt");
            FileOutputStream fos=new FileOutputStream("C:/Users/swapn/Desktop/java/SECTION 23 STREAM/destination.txt");

            SequenceInputStream sis= new SequenceInputStream(fis1,fis2);
            int b;
            while ((b=sis.read())!=-1) {
                fos.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();

            System.out.println("File Created Succsessfully.");

        } catch (FileNotFoundException e) { System.out.println(e);} 
        catch (IOException e) { System.out.println(e);}
    } 
}

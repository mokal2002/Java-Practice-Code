import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args)  {
        try{
            FileInputStream fis=new FileInputStream("C:/Users/swapn/Desktop/java/SECTION 23 STREAM/source1.txt");
            FileOutputStream fos=new FileOutputStream("C:/Users/swapn/Desktop/java/SECTION 23 STREAM/source2.txt");

            int b;
            while ((b=fis.read())!=-1 ) {
                if (b>=65 && b<=90) {
                    fos.write(b+32);
                }
                else {
                    fos.write(b);
                }
            }
            fis.close();
            fos.close();
            System.out.println("File Created Succsessfully.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

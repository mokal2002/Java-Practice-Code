import java.io.FileOutputStream;

public class fileoutstream {
    public static void main(String[] args) throws Exception {
      
            try (FileOutputStream fos = new FileOutputStream("C:/Users/swapn/Desktop/java/text.txt")) {
                String str="java Programming";
                byte b[]=str.getBytes();
                fos.write(b);
                fos.close();
            }
  
   
}
}
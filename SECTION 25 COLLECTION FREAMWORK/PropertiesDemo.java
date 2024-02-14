import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        // p.setProperty("name", "Aniket");
        // p.setProperty("age", "25");

        // p.storeToXML(new FileOutputStream("/Users/swapn/Desktop/java/students.xml"),
        // "Student");

        p.load(new FileInputStream("/Users/swapn/Desktop/java/students.txt"));
        // p.loadFromXML(new FileInputStream("/Users/swapn/Desktop/java/students.xml"));
        //
        // System.out.println(p.get("name"));
        // System.out.println(p.get("age"));
        System.out.println(p);

    }
}

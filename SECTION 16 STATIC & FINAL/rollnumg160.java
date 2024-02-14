import java.util.Date;

class Student
{
    private String rollNo;
    private String name;
    
    private static int count=1;
    
    private String assignRollNo()
    {
        Date d=new Date();
        
        String rno=name +" Roll No is : "+"Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student(String n)
    {
        name=n;
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
    
}

public class rollnumg160 {
    public static void main(String[] args) 
    {
        Student s1=new Student("john");
        Student s2=new Student("smith");
        Student s3=new Student("bond");
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
        
    }   
}

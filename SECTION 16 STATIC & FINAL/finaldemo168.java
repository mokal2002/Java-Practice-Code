class test {
    static int num=1;
    static {
        System.out.println("hello "+num);
    }
    static
        {
            System.out.println("bye");
        }
}


class finaldemo168{
    
    public static void main(String[] args) {
        test t=new test();
    }
}

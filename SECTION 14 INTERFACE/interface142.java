interface test {
    void meth1();
    void meth2();
    // void meth3();
}
class My implements test {
    public void meth1(){
        System.out.println("My 1");
    }
    public void meth2(){
        System.out.println("My 2");
    }
    public void meth3(){
        System.out.println("My 3");
    }
}

class interface142 {
    public static void main(String[] args) {
        test t=new My();
        t.meth1();
        t.meth2();
        // t.meth3();
    }
}